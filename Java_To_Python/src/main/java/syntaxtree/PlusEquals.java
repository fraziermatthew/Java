package syntaxtree;
import visitor.Visitor;

public class PlusEquals extends Statement {
  public Identifier i;
  public Exp e;

  public PlusEquals(Identifier ai, Exp ae) {
    i=ai; e=ae; 
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}

