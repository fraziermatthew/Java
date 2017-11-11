package driver;

import frontend.generated.*;
import java.io.*;
import syntaxtree.Program;
import visitor.PythonPrintVisitor;

public class Ram17Compiler {

    static PrintWriter debug = new PrintWriter(System.out);

    public static void main(String[] args) throws ParseException, TokenMgrError, FileNotFoundException {

        if (args.length == 0) {
            RamParser parser = new RamParser( System.in ) ;
            parser.Goal();
        } else {
            java.io.InputStream is = new java.io.FileInputStream(new java.io.File(args[0]));
            RamParser parser = new RamParser( is ) ;
            parser.Goal();
            // Program root = parser.Goal();
            Program root = parser.Goal();
            root.accept(new PythonPrintVisitor());

            System.out.println("Program lexed successfully");
        }           
    }
}
