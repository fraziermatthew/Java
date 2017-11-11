package test;

import frontend.generated.ParseException;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


/**
 *
 * @author richardburns
 */
@RunWith(value = Parameterized.class)
public class PythonTest {

    @Parameter
    public String filePath;
    

    @Parameters(name = "{index}: testFile - {0}")
    public static Object[] data() {
        return new Object[] {
            System.getProperty("TEST_PROGRAMS_DIR")+"\\LessThan.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\And.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\IfTrue.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\IfFalse.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\Not1.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\Not2.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\While.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\MethodCall.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\NewObject.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\ClassLevel.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\ArrayTest.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\Factorial.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\ComplexMath.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\LinearSearch.ram17",
            System.getProperty("TEST_PROGRAMS_DIR")+"\\pass11.ram17"
        };
    }

    @Test(timeout=1000)
    public void testRamProgram() throws FileNotFoundException, IOException, ParseException {
        
        String[] args = null;
        System.out.printf("Running javacc parser on %s ...\n", filePath.toString());
        args = new String[] { filePath.toString() };
                

        InputStream is = new FileInputStream(new File(args[0]));
        frontend.generated.RamParser parser = new frontend.generated.RamParser(is);
        syntaxtree.Program root = parser.Goal();
                    
        System.out.println("AST Created ...");

        
        System.out.println("Generating Python Code ...");
        // prepare to capture System.output
        PrintStream originalOut = System.out;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        try {
            root.accept(new visitor.PythonPrintVisitor());
        } finally {
            // restore normal System.output operation
            System.setOut(originalOut);            
        }

        System.out.println("Saving Python File ...");
        PrintWriter writer = new PrintWriter(filePath+".py");
        writer.print(os + System.getProperty("line.separator"));
        writer.close();
                    
        System.out.println("Running Python File ...");
        Process p = Runtime.getRuntime().exec("python.exe "+filePath+".py");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(p.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(p.getErrorStream()));

        System.out.println("Saving Python Output ...");
        writer = new PrintWriter(filePath+".py"+".output");
        String s;
        while ((s = br1.readLine()) != null)    // write stdout
        {
            writer.print(s + System.getProperty("line.separator"));
            System.out.println(s);
        }
        while ((s = br2.readLine()) != null)    // write stderr
        {
            writer.print(s + System.getProperty("line.separator"));
            System.err.println(s);
        }                    
        writer.close();

        System.out.println("Comparing Against Expected Output ...");
        // String s1 = org.apache.commons.io.FileUtils.readFileToString(new java.io.File(filePath+".correct"));
        // String s2 = org.apache.commons.io.FileUtils.readFileToString(new java.io.File(filePath+".py"+".output"));
        String s1 = new Scanner(new File(filePath+".correct")).useDelimiter("\\Z").next();
        String s2 = new Scanner(new File(filePath+".py"+".output")).useDelimiter("\\Z").next();
        s1 = s1.replaceAll("\\r\\n?", "\n");  // normalize line endings for Windows vs. Unix
        s2 = s2.replaceAll("\\r\\n?", "\n");
        assertEquals(s1, s2); 
    }

}
