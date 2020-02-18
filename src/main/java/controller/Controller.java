package controller;

import Listeners.CodeGeneratorListener;
import Listeners.SemanticListener;
import abstraction.CodeGen;
import abstraction.newToken;
import antlr.MiniJavaLexer;
import antlr.MiniJavaParser;
import error.LexerError;
import error.ParserError;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller
{
    @FXML TextArea text;
    @FXML TableView<newToken> tokenView;
    @FXML TableColumn<newToken, String> tLexeme;
    @FXML TableColumn<newToken, String> tClass;

    @FXML TableView<CodeGen> codeTable;
    @FXML TableColumn<CodeGen, String> op;
    @FXML TableColumn<CodeGen, String> src1;
    @FXML TableColumn<CodeGen, String> src2;
    @FXML TableColumn<CodeGen, String> dest;

    @FXML Button runButton;
    @FXML TextArea status;

    public static boolean lexerError  = false;
    public static boolean parserError = false;

    public static ArrayList<String> variables = new ArrayList<>();
    public static ArrayList<String> methodId = new ArrayList<>();
    public static ArrayList<String> classId = new ArrayList<>();
    public static HashMap<String, String> map = new HashMap<>();

    public static ArrayList<CodeGen> codeGens = new ArrayList<>();

    public void initialize()
    {
        tokenView.setPlaceholder(new Label("Click Run Lexer"));
        tLexeme.setCellValueFactory(new PropertyValueFactory<>("tok"));
        tClass.setCellValueFactory(new PropertyValueFactory<>("cl"));

        codeTable.setPlaceholder(new Label("Click To Run"));
        op.setCellValueFactory(new PropertyValueFactory<>("op"));
        src1.setCellValueFactory(new PropertyValueFactory<>("src1"));
        src2.setCellValueFactory(new PropertyValueFactory<>("src2"));
        dest.setCellValueFactory(new PropertyValueFactory<>("dest"));

    }

    @FXML public void clean()
    {
        tokenView.getItems().clear();
        tokenView.refresh();
        codeTable.getItems().clear();
        codeTable.refresh();
        status.clear();

        Controller.variables.clear();
        Controller.methodId.clear();
        Controller.classId.clear();
        Controller.map.clear();
        Controller.codeGens.clear();

        Controller.lexerError  = false;
        Controller.parserError = false;

    }

    @FXML public void run()
    {
        clean();

        Controller.lexerError  = false;
        Controller.parserError = false;

        runButton.setDisable(true);
        tokenView.getItems().clear();
        tokenView.refresh();
        codeTable.getItems().clear();
        codeTable.refresh();
        status.clear();

        CharStream inputStream = CharStreams.fromString(text.getText());
        MiniJavaLexer lexer = new MiniJavaLexer(inputStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new LexerError(status));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        tokenStream.fill();

        for (Token token : tokenStream.getTokens())
        {
            newToken newToken = new newToken(token.getText(), lexer.getVocabulary().getSymbolicName(token.getType()));
            if (newToken.getCl().equals("ERROR"))
            {
                status.appendText("Line : " + token.getLine() + " -> " + newToken.getTok() + " is not an ID -_-\n");
                Controller.lexerError = true;
            }
            else
                tokenView.getItems().add(newToken);
        }

        if(!lexerError)
        {
            status.setText("Lexing Finished Successfully ! ^_^\n");

            MiniJavaParser parser = new MiniJavaParser(tokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(new ParserError(status));
            parser.addParseListener(new SemanticListener(parser));
            ParserRuleContext tree = parser.minijava();

            if (!parserError)
            {
                status.appendText("Parsing And Semantic Analysis Finished Successfully ! ^_^\n");

                ParseTreeWalker treeWalker = new ParseTreeWalker();
                treeWalker.walk(new CodeGeneratorListener(), tree);

                status.appendText("Code Generation Finished Successfully ! ^_^\nLoading TREE ... 0_0" + " (takes a few minutes in first run) \n");
                
                codeTable.getItems().addAll(codeGens);

                new Thread(() -> Trees.inspect(tree, parser)).start();
            }

        }

        runButton.setDisable(false);
    }
}