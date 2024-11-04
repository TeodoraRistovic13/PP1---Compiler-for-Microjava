// generated with ast extension for cup
// version 0.8
// 15/0/2024 16:55:1


package rs.ac.bg.etf.pp1.ast;

public class NoPrintVar extends PrintAdditionalParam {

    public NoPrintVar () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NoPrintVar(\n");

        buffer.append(tab);
        buffer.append(") [NoPrintVar]");
        return buffer.toString();
    }
}
