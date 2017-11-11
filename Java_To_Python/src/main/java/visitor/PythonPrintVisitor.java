package visitor;

import syntaxtree.*;
import java.util.*;

public class PythonPrintVisitor implements Visitor {

    int level = 0;
    ArrayList<String> obj = new ArrayList<String>();

    public String indent(int level) {
        String s = "";
        int i = 0;
        while (i < level) {
            s += "    ";
            i++;
        }
        return s;
    }

    // MainClass m;
    // ClassDeclList cl;
    public void visit(Program n) {
        for (int i = 0; i < n.cl.size(); i++) {
            n.cl.elementAt(i).accept(this);
        }
        n.m.accept(this);
        System.out.println();
    }

    // Identifier i1,i2;
    // Statement s;
    public void visit(MainClass n) {
        System.out.println("if __name__ == '__main__':");
        n.s.accept(this);
    }

    // Identifier i;
    // VarDeclList vl;
    // MethodDeclList ml;
    public void visit(ClassDeclSimple n) {
        System.out.print("class ");
        n.i.accept(this);
        System.out.println("():");
        //  Class Level Variables
        for (int i = 0; i < n.vl.size(); i++) {
            n.vl.elementAt(i).accept(this);
            if (i < n.vl.size()) {
                System.out.println("");
            } else {
                obj.add("$");
            }
        }
        System.out.println();
        for (int i = 0; i < n.ml.size(); i++) {
            n.ml.elementAt(i).accept(this);
        }
        System.out.println();
    }

    // Type t;
    // Identifier i;
    // FormalList fl;
    // VarDeclList vl;
    // StatementList sl;
    // Exp e;
    public void visit(MethodDecl n) {
        System.out.print(indent(++level));
        System.out.print("def ");
        n.i.accept(this);
        System.out.print("(self");
        //  Parameters
        for (int i = 0; i < n.fl.size(); i++) {
            if (i < n.fl.size()) {
                System.out.print(", ");
            }
            n.fl.elementAt(i).i.accept(this);
        }
        System.out.println("):");

        for (String temp : obj) {
            System.out.print(indent(level));
            System.out.print("    global ");
            System.out.println(temp);
        }

        //  Method Statements
        for (int i = 0; i < n.sl.size(); i++) {
            n.sl.elementAt(i).accept(this);
            if (i < n.sl.size()) {
                System.out.println("");
            }
        }
        System.out.print(indent(level));
        System.out.print("    return ");
        n.e.accept(this);
        System.out.print(indent(--level));
        System.out.println();
    }

    // Type t;
    // Identifier i;
    public void visit(VarDecl n) {
        System.out.print(indent(++level));
        n.i.accept(this);
        n.t.accept(this);
        System.out.print(indent(--level));
        obj.add(n.i.toString());
    }

    // Type t;
    // Identifier i;
    public void visit(Formal n) {
        n.t.accept(this);
        System.out.print(" ");
        n.i.accept(this);
    }

    // String s;
    public void visit(IdentifierType n) {
        System.out.print(n.s);
    }

    public void visit(Block n) {
        for (int i = 0; i < n.sl.size(); i++) {
            n.sl.elementAt(i).accept(this);
            if (i + 1 < n.sl.size()) {
                System.out.println("");
            }
        }
    }

    // Exp e;
    // Statement s1,s2;
    public void visit(If n) {
        System.out.print(indent(++level));
        System.out.print("if ");
        n.e.accept(this);
        System.out.println(":");
        n.s1.accept(this);
        System.out.println();
        System.out.print(indent(level));
        System.out.println("else:");
        n.s2.accept(this);
        System.out.print(indent(--level));
    }

    // Exp e;
    // Statement s;
    // StatementList sl;
    public void visit(While n) {
        System.out.print(indent(++level));
        System.out.print("while ");
        n.e.accept(this);
        System.out.println(":");
        n.s.accept(this);
        System.out.print(indent(--level));
    }

    // Exp e1, e2, e3;
    // Identifier i, i2;
    // Statement s;
    public void visit(For n) {
        System.out.print(indent(++level));
        n.i.accept(this);
        System.out.print(" = ");
        n.e1.accept(this);
        System.out.println();
        System.out.print(indent(level));
        System.out.print("while ");
        n.e2.accept(this);
        System.out.println(":");
        n.s.accept(this);
        System.out.println();
        System.out.print(indent(++level));
        n.i2.accept(this);
        System.out.print(" = ");
        n.e3.accept(this);
        System.out.print(indent(--level));
        System.out.print(indent(--level));
    }

    // Exp e;
    public void visit(Print n) {
        System.out.print(indent(++level));
        System.out.print("print(");
        for (int i = 0; i < n.el.size(); i++) {
            n.el.elementAt(i).accept(this);
            if (i != n.el.size() - 1) {
                System.out.print("+\" \"+");
            }
        }
        System.out.print(", end='')");
        System.out.print(indent(--level));
    }

    // Exp e;
    public void visit(Println n) {
        System.out.print(indent(++level));
        System.out.print("print(");
        for (int i = 0; i < n.el.size(); i++) {
            n.el.elementAt(i).accept(this);
            if (i != n.el.size() - 1) {
                System.out.print("+\" \"+");
            }
        }
        System.out.print(")");
        System.out.print(indent(--level));
    }

    // Identifier i;
    // Exp e;
    public void visit(Assign n) {
        System.out.print(indent(++level));
        n.i.accept(this);
        System.out.print(" = ");
        n.e.accept(this);
        System.out.print(indent(--level));
    }

    // Identifier i;
    // Exp e1,e2;
    public void visit(ArrayAssign n) {
        System.out.print(indent(++level));
        n.i.accept(this);
        System.out.print(".append(");
        n.e2.accept(this);
        System.out.print(")");
        System.out.print(indent(--level));
    }

    // Exp e1,e2;
    public void visit(And n) {
        n.e1.accept(this);
        System.out.print(" and ");
        n.e2.accept(this);
    }

    // Exp e1,e2;
    public void visit(Or n) {
        n.e1.accept(this);
        System.out.print(" or ");
        n.e2.accept(this);
    }

    // Exp e1,e2;
    public void visit(LessThan n) {
        n.e1.accept(this);
        System.out.print(" < ");
        n.e2.accept(this);
    }

    // Exp e1,e2;
    public void visit(GreaterThan n) {
        n.e1.accept(this);
        System.out.print(" > ");
        n.e2.accept(this);
    }

    // Exp e1,e2;
    public void visit(LessThanOrEqualTo n) {
        n.e1.accept(this);
        System.out.print(" <= ");
        n.e2.accept(this);
    }

    // Exp e1,e2;
    public void visit(GreaterThanOrEqualTo n) {
        n.e1.accept(this);
        System.out.print(" >= ");
        n.e2.accept(this);
    }

    // Exp e1,e2;
    public void visit(Equals n) {
        n.e1.accept(this);
        System.out.print(" == ");
        n.e2.accept(this);
    }

    // Exp e1,e2;
    public void visit(NotEquals n) {
        n.e1.accept(this);
        System.out.print(" != ");
        n.e2.accept(this);
    }

    // Exp e1,e2;
    public void visit(Plus n) {
        n.e1.accept(this);
        System.out.print(" + ");
        n.e2.accept(this);
    }

    // Identifier i;
    // Exp e;
    public void visit(PlusEquals n) {
        System.out.print(indent(++level));
        n.i.accept(this);
        System.out.print(" += ");
        n.e.accept(this);
        System.out.print(indent(--level));
    }

    // Exp e1,e2;
    public void visit(Minus n) {
        n.e1.accept(this);
        System.out.print(" - ");
        n.e2.accept(this);
    }

    // Identifier i;
    // Exp e;
    public void visit(MinusEquals n) {
        System.out.print(indent(++level));
        n.i.accept(this);
        System.out.print(" -= ");
        n.e.accept(this);
        System.out.print(indent(--level));
    }

    // Exp e1,e2;
    public void visit(Times n) {
        n.e1.accept(this);
        System.out.print(" * ");
        n.e2.accept(this);
    }

    // Exp e1,e2;
    public void visit(ArrayLookup n) {
        n.e1.accept(this);
        System.out.print("[");
        n.e2.accept(this);
        System.out.print("]");
    }

    // Exp e;
    public void visit(ArrayLength n) {
        n.e.accept(this);
        System.out.print(".length");
    }

    // Exp e;
    // Identifier i;
    // ExpList el;
    public void visit(Call n) {
        n.e.accept(this);
        System.out.print(".");
        n.i.accept(this);
        System.out.print("(");
        for (int i = 0; i < n.el.size(); i++) {
            n.el.elementAt(i).accept(this);
            if (i + 1 < n.el.size()) {
                System.out.print(", ");
            }
        }
        System.out.print(")");
    }

    // int i;
    public void visit(IntegerLiteral n) {
        System.out.print(n.i);
    }

    public void visit(True n) {
        System.out.print("True");
    }

    public void visit(False n) {
        System.out.print("False");
    }

    // String s;
    public void visit(IdentifierExp n) {
        System.out.print(n.s);
    }

    // String s;
    public void visit(Identifier n) {
        System.out.print(n.s);
    }

    public void visit(This n) {
        System.out.print("self");
    }

    // Exp e;
    public void visit(NewArray n) {
        System.out.print("[");
        n.e.accept(this);
        System.out.print("]");
    }

    // Identifier i;
    public void visit(NewObject n) {
        System.out.print(n.i.s);
        System.out.print("()");
    }

    // Exp e;
    public void visit(Not n) {
        System.out.print("not ");
        n.e.accept(this);
    }

    // Identifier i;
    // Identifier j;
    // VarDeclList vl;
    // MethodDeclList ml;
    public void visit(ClassDeclExtends n) {
        System.out.print("class ");
        n.i.accept(this);
        System.out.println(" extends ");
        n.j.accept(this);
        System.out.println(" { ");
        for (int i = 0; i < n.vl.size(); i++) {
            System.out.print("  ");
            n.vl.elementAt(i).accept(this);
            if (i + 1 < n.vl.size()) {
                System.out.println();
            }
        }
        for (int i = 0; i < n.ml.size(); i++) {
            System.out.println();
            n.ml.elementAt(i).accept(this);
        }
        System.out.println();
        System.out.println("}");
    }

    public void visit(IntArrayType n) {
        System.out.print(" = []");
    }

    public void visit(BooleanType n) {
        System.out.print(" = False");
    }

    public void visit(IntegerType n) {
        System.out.print(" = 0");
    }

}
