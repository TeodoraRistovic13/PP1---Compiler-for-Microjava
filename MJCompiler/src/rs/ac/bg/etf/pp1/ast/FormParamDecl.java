// generated with ast extension for cup
// version 0.8
// 15/0/2024 16:55:0


package rs.ac.bg.etf.pp1.ast;

public class FormParamDecl extends FormalParamList {

    private FormalParamDecl FormalParamDecl;

    public FormParamDecl (FormalParamDecl FormalParamDecl) {
        this.FormalParamDecl=FormalParamDecl;
        if(FormalParamDecl!=null) FormalParamDecl.setParent(this);
    }

    public FormalParamDecl getFormalParamDecl() {
        return FormalParamDecl;
    }

    public void setFormalParamDecl(FormalParamDecl FormalParamDecl) {
        this.FormalParamDecl=FormalParamDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(FormalParamDecl!=null) FormalParamDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(FormalParamDecl!=null) FormalParamDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(FormalParamDecl!=null) FormalParamDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParamDecl(\n");

        if(FormalParamDecl!=null)
            buffer.append(FormalParamDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParamDecl]");
        return buffer.toString();
    }
}
