import java.util.Objects;

public class EvaluateReversePolishNotation {
    int itemsRemaining;

    public int evalRPN(String[] tokens) {
        itemsRemaining = tokens.length;
        if (itemsRemaining == 1) {
            return Integer.parseInt(tokens[0]);
        }
        String lastOperator = tokens[--itemsRemaining];
        return calculate(tokens, lastOperator);
    }

    public int calculate(String[] tokens, String operator) {
        String newItem = tokens[--itemsRemaining];
        if (checkIfOperator(newItem)) {
            return applyOperation(operator, calculate(tokens, newItem), Integer.parseInt(tokens[itemsRemaining-1]));
        }
        String itemAfter = tokens[--itemsRemaining];
        if (checkIfOperator(itemAfter)) {
            return applyOperation(operator, Integer.parseInt(newItem), calculate(tokens, itemAfter));
        }
        return applyOperation(operator, Integer.parseInt(newItem), Integer.parseInt(itemAfter));
    }

    public boolean checkIfOperator(String item) {
        return item.equals("+")
                || item.equals("-")
                || item.equals("*")
                || item.equals("/");
    }

    public int applyOperation(String operator, int a, int b) {
        return switch (operator) {
            case "+" -> b + a;
            case "-" -> b - a;
            case "*" -> b * a;
            case "/" -> b / a;
            default -> 0;
        };
    }
}
