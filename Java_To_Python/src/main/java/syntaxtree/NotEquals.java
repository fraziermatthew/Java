package syntaxtree;
import visitor.Visitor;

public class NotEquals extends Exp {
  public Exp e1,e2;
  
  public NotEquals(Exp ae1, Exp ae2) {
    e1=ae1; e2=ae2;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

}
