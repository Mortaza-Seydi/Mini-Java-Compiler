package Listeners;

import antlr.MiniJavaBaseListener;
import antlr.MiniJavaParser;
import controller.Controller;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class SemanticListener extends MiniJavaBaseListener
{
    private MiniJavaParser parser;
    public SemanticListener(MiniJavaParser parser)
    {
        this.parser = parser;
    }

    @Override public void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx)
    {
        String id = ctx.Id().getText();

        if (Controller.classId.contains(id))
            parser.notifyErrorListeners("Duplicate class : " + id);

        else
            Controller.classId.add(id);
    }

    @Override public void exitFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx)
    {
        String id = ctx.Id().getText();

        if (Controller.variables.contains(id))
            parser.notifyErrorListeners("Duplicate var : " + id);

        else
        {
            Controller.variables.add(id);
            Controller.map.put(id, ctx.declarators().type().getText());
        }

        if (ctx.expression() != null)
        {
            String id1 = ctx.Id().getText();
            String t1 = Controller.map.get(id1);

            String id2 = ctx.expression().reference().getText();
            String t2 = Controller.map.get(id2);

            if (t2 != null)
            {
                if (!t1.contains(t2))
                    parser.notifyErrorListeners("cant assign '" + t2 + "' to '" + t1 + "'");
            }

        }
    }

    @Override public void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx)
    {
        String id = ctx.Id().getText();

        if (Controller.methodId.contains(id))
            parser.notifyErrorListeners("Duplicate method : " + id);

        else
            Controller.methodId.add(id);
    }

    @Override public void exitReference(MiniJavaParser.ReferenceContext ctx)
    {
        List<TerminalNode> ids = ctx.Id();
        for (TerminalNode terminalNode : ids)
        {
            String id = terminalNode.getText();
            if (!Controller.variables.contains(id))
                parser.notifyErrorListeners("undefined var : " + id);
        }
    }

    @Override public void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx)
    {

        String id = ctx.Id().getText();

        if (Controller.variables.contains(id))
            parser.notifyErrorListeners("Duplicate var : " + id);
        else
        {
            Controller.variables.add(id);
            Controller.map.put(id, ctx.type().getText());
        }

        if (ctx.expression() != null)
        {
            String id1 = ctx.Id().getText();
            String t1 = Controller.map.get(id1);

            if (ctx.expression().reference() != null)
            {
                String id2 = ctx.expression().reference().getText();
                String t2 = Controller.map.get(id2);

                if (t2 == null)
                    parser.notifyErrorListeners("undefined var : " + id2);

                else
                {
                    if (!t1.contains(t2))
                        parser.notifyErrorListeners("cant assign '" + t2 + "' to '" + t1 + "'");
                }
            }
        }
    }

    @Override public void exitGoExp(MiniJavaParser.GoExpContext ctx)
    {
        if (Controller.variables.contains(ctx.reference().getText()) && ctx.expression().reference() != null)
        {
            String t1 = Controller.map.get(ctx.reference().getText());

            String id2 = ctx.expression().reference().getText();
            String t2 = Controller.map.get(id2);

            if (!t1.equals(t2))
                parser.notifyErrorListeners("cant assign '" + t2 + "' to '" + t1 + "'");
        }
    }

}

