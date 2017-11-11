package syntaxtree;
import visitor.Visitor;

public class LessThanOrEqualTo extends Exp {
  public Exp e1,e2;
  
  public LessThanOrEqualTo(Exp ae1, Exp ae2) {
    e1=ae1; e2=ae2;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

}
