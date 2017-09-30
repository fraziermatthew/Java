package slpinterpreter;

import slpinterpreter.grammar.*;

/**
 * MaxArgs.
 *
 * @author matthewfrazier
 */
public class MaxArgs {

    public static int maxargs(Stm s) {
        if (s instanceof AssignStm) {
            AssignStm stm = (AssignStm) s;
            return maxargs(stm.exp);
        } else if (s instanceof CompoundStm) {
            CompoundStm stm = (CompoundStm) s;
            return Math.max(maxargs(stm.stm2), maxargs(stm.stm1));
        } else {
            PrintStm stm = (PrintStm) s;
            return Math.max(len(stm.exps), maxargs(stm.exps));
        }
    }

    public static int maxargs(Exp e) {
        if (e instanceof IdExp) {
            return 0;
        } else if (e instanceof NumExp) {
            return 0;
        } else if (e instanceof EseqExp) {
            EseqExp ex = (EseqExp) e;
            return Math.max(maxargs(ex.stm), maxargs(ex.exp));
        } else {
            OpExp ex = (OpExp) e;
            return Math.max(maxargs(ex.left), maxargs(ex.right));
        }
    }

    public static int maxargs(ExpList es) {
        if (es instanceof PairExpList) {
            PairExpList exps = (PairExpList) es;
            return Math.max(maxargs(exps.tail), maxargs(exps.head));
        } else {
            LastExpList exp = (LastExpList) es;
            return maxargs(exp.head);
        }
    }

    public static int len(ExpList es) {
        if (es instanceof PairExpList) {
            PairExpList exps = (PairExpList) es;
            return 1 + len(exps.tail);
        } else {
            return 1;
        }
    }

}
