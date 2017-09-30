package slpinterpreter;

import slpinterpreter.grammar.*;

/**
 * Driver.
 *
 * @author richardburns
 */

public class Driver {

    public static void main(String[] args) {
        Stm probToRun =  new CompoundStm(new AssignStm("a", new OpExp(new NumExp(5), OpExp.Plus,
                                    new NumExp(3))),
                    new CompoundStm(new AssignStm("b",
                                    new EseqExp(new PrintStm(new PairExpList(new IdExp("a"),
                                                            new LastExpList(new OpExp(new IdExp("a"), OpExp.Minus,
                                                                            new NumExp(1))))),
                                            new OpExp(new NumExp(10), OpExp.Times, new IdExp("a")))),
                            new PrintStm(new LastExpList(new IdExp("b")))));
                
        System.out.println("Maxargs: ");
        System.out.println(MaxArgs.maxargs(probToRun));   // functional        
        System.out.println("Interpreted Result:");
        Interpreter.interp(probToRun);                    // functional
    }
    
}
