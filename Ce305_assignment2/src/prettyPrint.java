import jnr.ffi.Variable;

import java.util.HashMap;
import java.util.Map;

public class prettyPrint extends pythonBaseListener{

    private StringBuilder sb = new StringBuilder();//used to concatenate strings
    public Map<String, String> data = new HashMap<String, String>();

    private int indentLevel = 0;

    private void indent() {
        indentLevel++;
    }

    private void unindent() {
        indentLevel--;
    }

    private void print(String text) {
        sb.append("    ".repeat(indentLevel));
        sb.append(text);
        sb.append("\n");
    }

    @Override
    public void exitAssign(pythonParser.AssignContext context) {
        String variableName = context.VARIABLE().getText();
        String expression = context.expr().getText();
        print(variableName + " = " + expression);
    }

    @Override
    public void enterDeclare(pythonParser.DeclareContext context) {
        String variable = context.VARIABLE().getText();
        String identifier = context.variableType().getText();
        String newIdentifier = "";

        data.put(variable+ " ", " Variable " + variable + " is a " + identifier);
    }

    @Override
    public void enterIteration(pythonParser.IterationContext context) {
        print("while " + context.expr(0).getText() + ":");
        indent();
        data.put("while ", " While is a loop");
    }

    @Override
    public void exitIteration(pythonParser.IterationContext context){
        unindent();
    }
    @Override
    public void exitTotal(pythonParser.TotalContext context){
        print(context.getText());
        data.put("+="+ " ", " adds a value to an assigned expression as the sum total");

    }
    @Override
    public void exitPrint(pythonParser.PrintContext context){
        print("print(" + context.expr().getText() + ")");
        data.put("Print"+ " ", " Prints the expression or variable to the terminal");
    }

    @Override
    public void enterCondition(pythonParser.ConditionContext context) {
        print("if " + context.expr().getText() + ":");
        indent();
        data.put("if "+ " ", " conditional statement");

    }
    @Override
    public void exitCondition(pythonParser.ConditionContext context) {
        unindent();
    }
    @Override
    public void enterElse(pythonParser.ElseContext context) {
        unindent();
        print(context.getText() + ":");
        data.put("else "+ " ", " conditional statement");

    }
    @Override
    public void exitElse(pythonParser.ElseContext context) {
        indent();
    }

    //appends () around the expression
    public String getResult() {
        return sb.toString();
    }
    public void getSymbolTable() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
    }

}
