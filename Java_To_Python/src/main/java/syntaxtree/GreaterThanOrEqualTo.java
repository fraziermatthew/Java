package syntaxtree;
import visitor.Visitor;

public class GreaterThanOrEqualTo extends Exp {
  public Exp e1,e2;
  
  public GreaterThanOrEqualTo(Exp ae1, Exp ae2) {
    e1=ae1; e2=ae2;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

}
