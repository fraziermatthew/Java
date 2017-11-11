package syntaxtree;
import visitor.Visitor;

public class For extends Statement {
  public Exp e1, e2, e3;
  public Identifier i, i2;
  public Statement s;

  public For(Identifier ai, Identifier ai2, Exp ae1, Exp ae2, Exp ae3, Statement as) {
    i=ai; i2=ai2; e1=ae1; e2=ae2; e3=ae3; s=as; 
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

}

