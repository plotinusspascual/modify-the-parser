package ast;

import lexer.Symbol;
import lexer.Token;
import visitor.ASTVisitor;

public class StringLitTree extends AST {
  private Symbol symbol;

  public StringLitTree(Token tok) { this.symbol = tok.getSymbol(); }
  public Object accept(ASTVisitor v) { return v.visitStringLitTree(this); }
  public  Symbol getSymbol() { return symbol; }
}
