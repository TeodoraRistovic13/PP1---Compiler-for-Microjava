// generated with ast extension for cup
// version 0.8
// 15/0/2024 16:55:1


package rs.ac.bg.etf.pp1.ast;

public class ScopeArrayElem extends Designator {

    private String namespaceName;
    private String desigArrayName;
    private Expr Expr;

    public ScopeArrayElem (String namespaceName, String desigArrayName, Expr Expr) {
        this.namespaceName=namespaceName;
        this.desigArrayName=desigArrayName;
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName=namespaceName;
    }

    public String getDesigArrayName() {
        return desigArrayName;
    }

    public void setDesigArrayName(String desigArrayName) {
        this.desigArrayName=desigArrayName;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ScopeArrayElem(\n");

        buffer.append(" "+tab+namespaceName);
        buffer.append("\n");

        buffer.append(" "+tab+desigArrayName);
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ScopeArrayElem]");
        return buffer.toString();
    }
}
