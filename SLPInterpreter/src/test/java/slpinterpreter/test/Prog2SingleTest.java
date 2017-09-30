package test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import slpinterpreter.grammar.Stm;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import slpinterpreter.Interpreter;
import slpinterpreter.MaxArgs;
import slpinterpreter.grammar.AssignStm;
import slpinterpreter.grammar.NumExp;

/**
 *
 * @author richardburns
 */
public class Prog2SingleTest {

    static Stm probToRun = new AssignStm("a", new NumExp(10));
    
    @Test
    public void evaluatesMaxArgs() {
        try {
            int maxargs = MaxArgs.maxargs(probToRun);
            int correct = 0;
            assertEquals(correct, maxargs);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
    
    @Test
    public void evaluatesInterpreter() {
        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // save the old System.out
        PrintStream old = System.out;
        // assign new special stream
        System.setOut(ps);
        try {
            Interpreter.interp(probToRun);
            String correct = "";
            assertEquals(baos.toString().trim(), correct.trim());            
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // restore normal System.output operation
            System.out.flush();
            System.setOut(old);            
        } 
    }
    
}
