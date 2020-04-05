package interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        StringTokenizer s = new StringTokenizer(context);
        while (s.hasMoreTokens()) {
            String test = s.nextToken();
            if (test.equals(data)) {
                return true;
            }
        }
        return false;

    }
}
