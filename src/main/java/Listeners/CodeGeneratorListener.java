package Listeners;

import abstraction.CodeGen;
import antlr.MiniJavaBaseListener;
import antlr.MiniJavaParser;
import controller.Controller;

import java.util.Stack;

public class CodeGeneratorListener extends MiniJavaBaseListener
{
    private Stack<String> semanticStack = new Stack<>();
    String label = "-", ifLabel, elseLabel;
    String whileStart, whileEnd;
    int c = 0, l = 0;

    @Override public void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx)
    {
        if (ctx.expression() != null)
            semanticStack.push(ctx.Id().getText());
    }

    @Override public void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx)
    {
        if (ctx.expression() != null)
            addCode("=", semanticStack.pop(),  "", semanticStack.pop());
    }

    @Override public void enterGoExp(MiniJavaParser.GoExpContext ctx)
    {
        semanticStack.push(ctx.reference().getText());
    }
    @Override public void exitGoExp(MiniJavaParser.GoExpContext ctx)
    {
        addCode("=", semanticStack.pop(),  "", semanticStack.pop());
    }

    @Override public void enterExpression(MiniJavaParser.ExpressionContext ctx)
    {
        if (ctx.reference() != null)
            semanticStack.push(ctx.start.getText());

        if (ctx.Number() != null)
            semanticStack.push(ctx.Number().getText());

       if (ctx.String() != null)
           semanticStack.push(ctx.String().getText());

        if (ctx.TRUE() != null)
            semanticStack.push(ctx.TRUE().getText());

        if (ctx.FALSE() != null)
            semanticStack.push(ctx.FALSE().getText());
    }

    @Override public void exitExpression(MiniJavaParser.ExpressionContext ctx)
    {
        if (ctx.arthmetic() != null)
        {
            String temp = getTemp();
            String src1 = semanticStack.pop();
            String src2 = semanticStack.pop();
            addCode(ctx.arthmetic().getText(), src2, src1, temp);
            semanticStack.push(temp);
        }

        if (ctx.bool() != null)
        {
            String temp = getTemp();
            String src1 = semanticStack.pop();
            String src2 = semanticStack.pop();
            addCode(ctx.bool().getText(), src2, src1, temp);
            semanticStack.push(temp);
        }
    }

    @Override public void enterIfBody(MiniJavaParser.IfBodyContext ctx)
    {
        ifLabel = getLabel();
        addCode("JPF", semanticStack.pop(), ifLabel, "");
    }

    @Override public void enterElseStatement(MiniJavaParser.ElseStatementContext ctx)
    {
        elseLabel = getLabel();
        addCode("JP", label, elseLabel, "");
        label = ifLabel;
    }

    @Override public void exitElseStatement(MiniJavaParser.ElseStatementContext ctx)
    {
        label = elseLabel;
    }

    @Override public void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx)
    {
        whileStart = getLabel();
        label = whileStart;
    }

    @Override public void enterWhileBody(MiniJavaParser.WhileBodyContext ctx)
    {
        whileEnd = getLabel();
        addCode("JPF", semanticStack.pop(), whileEnd, "");
    }

    @Override public void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx)
    {
        addCode("JP", whileStart, "", "");
        label = whileEnd;
    }

    private String getTemp()
    {
        String s = "t" + c;
        c++;
        return s;
    }

    private String getLabel()
    {
        String s = "L" + l;
        l++;
        return s;
    }

    private void addCode(String op, String src1, String src2, String dest)
    {
        if (label.equals("-"))
            Controller.codeGens.add(new CodeGen(op, src1, src2, dest));
        else
        {
            Controller.codeGens.add(new CodeGen(label +"  "+op, src1, src2, dest));
            label = "-";
        }
    }
}