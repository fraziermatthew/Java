package test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import slpinterpreter.grammar.Stm;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import slpinterpreter.Interpreter;
import slpinterpreter.MaxArgs;
import slpinterpreter.grammar.AssignStm;
import slpinterpreter.grammar.CompoundStm;
import slpinterpreter.grammar.EseqExp;
import slpinterpreter.grammar.IdExp;
import slpinterpreter.grammar.LastExpList;
import slpinterpreter.grammar.NumExp;
import slpinterpreter.grammar.OpExp;
import slpinterpreter.grammar.PairExpList;
import slpinterpreter.grammar.PrintStm;

/**
 *
 * @author richardburns
 */
public class Prog1SingleTest {

    static Stm probToRun
            = new CompoundStm(new AssignStm("a", new OpExp(new NumExp(5), OpExp.Plus,
                                    new NumExp(3))),
                    new CompoundStm(new AssignStm("b",
                                    new EseqExp(new PrintStm(new PairExpList(new IdExp("a"),
                                                            new LastExpList(new OpExp(new IdExp("a"), OpExp.Minus,
                                                                            new NumExp(1))))),
                                            new OpExp(new NumExp(10), OpExp.Times, new IdExp("a")))),
                            new PrintStm(new LastExpList(new IdExp("b")))));
    
    @Test
    public void evaluatesMaxArgs() {
        try {
            int maxargs = MaxArgs.maxargs(probToRun);
            int correct = 2;
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
            String correct = "8 7"+System.getProperty("line.separator")+
                             "80";
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
