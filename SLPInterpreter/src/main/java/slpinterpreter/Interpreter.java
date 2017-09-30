package slpinterpreter;

import slpinterpreter.grammar.*;

/**
 * Interpreter.
 *
 * @author matthewfrazier
 */
public class Interpreter {

    public static void interp(Stm s) {
        interpStm(s, null);
    }

    static Table interpStm(Stm s, Table t) {
        if (s instanceof AssignStm) {
            AssignStm stm = (AssignStm) s;
            IntAndTable it = interpExp(stm.exp, t);
            return new Table(stm.id, it.i, it.t);
        } else if (s instanceof CompoundStm) {
            CompoundStm comstm = (CompoundStm) s;
            return interpStm(comstm.stm2, interpStm(comstm.stm1, t));
        } else {
            PrintStm printstm = (PrintStm) s;
            return printStm(printstm.exps, t);
        }
    }

    static IntAndTable interpExp(Exp e, Table t) {
        if (e instanceof IdExp) {
            IdExp id = (IdExp) e;
            return new IntAndTable(t.lookup(id.id), t);
        } else if (e instanceof NumExp) {
            NumExp n = (NumExp) e;
            return new IntAndTable(n.num, t);
        } else if (e instanceof OpExp) {
            OpExp op = (OpExp) e;
            IntAndTable iat1 = interpExp(op.left, t);
            IntAndTable iat2 = interpExp(op.right, iat1.t);
            int result = 0;
            switch (op.oper) {
                case OpExp.Plus:
                    result = iat1.i + iat2.i;
                    break;
                case OpExp.Minus:
                    result = iat1.i - iat2.i;
                    break;
                case OpExp.Times:
                    result = iat1.i * iat2.i;
                    break;
                case OpExp.Div:
                    result = iat1.i / iat2.i;
                    break;
            }
            return new IntAndTable(result, iat2.t);
        } else {
            EseqExp exseq = (EseqExp) e;
            Table t2 = interpStm(exseq.stm, t);
            return interpExp(exseq.exp, t2);
        }
    }

    public static Table printStm(ExpList es, Table t) {
        if (es instanceof PairExpList) {
            PairExpList ex = (PairExpList) es;
            return printStm(ex.tail, output(ex.head, t, false));
        } else {
            LastExpList ex = (LastExpList) es;
            return output(ex.head, t, true);
        }
    }

    public static Table output(Exp e, Table t, boolean line) {
        IntAndTable iat = interpExp(e, t);
        if (line) {
            System.out.println(iat.i);
        } else {
            System.out.print(iat.i + " ");
        }
        return iat.t;
    }

}
