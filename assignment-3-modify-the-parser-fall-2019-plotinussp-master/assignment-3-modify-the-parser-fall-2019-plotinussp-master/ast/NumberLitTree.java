package ast;

import visitor.*;

public class NumberLitTree extends AST {
  public NumberLitTree(){

  }

  public Object accept(ASTVisitor v) { return v.visitNumberLitTree(this); }
}
