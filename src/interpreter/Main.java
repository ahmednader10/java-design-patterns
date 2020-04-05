package interpreter;

public class Main {

    private static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        Expression orExpression = new OrExpression(terminal2, terminal3);

        return orExpression;
    }

    public static void main(String[]args) {
        String context1 = "Lions";
        String context2 = "Bears";
        String context3 = "Lions Tigers";
        String context4 = "Lions Bears";
        String context5 = "Tigers Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context1 + " is " + define.interpret(context1));
        System.out.println(context2 + " is " + define.interpret(context2));
        System.out.println(context3 + " is " + define.interpret(context3));
        System.out.println(context4 + " is " + define.interpret(context4));
        System.out.println(context5 + " is " + define.interpret(context5));
    }
}
