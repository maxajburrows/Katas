import java.util.Objects;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        int itemsRemaining = tokens.length;
        String lastOperator = tokens[--itemsRemaining];
        return calculate(tokens, itemsRemaining, lastOperator);
    }

    public int calculate(String[] tokens, int itemsRemaining, String operator) {
        String newItem = tokens[--itemsRemaining];
        if (checkIfOperator(newItem)) {
            return applyOperation(operator, calculate(tokens, itemsRemaining, newItem), Integer.parseInt(tokens[itemsRemaining-1]));
        }
        String itemAfter = tokens[--itemsRemaining];
        if (checkIfOperator(itemAfter)) {
            return applyOperation(operator, calculate(tokens, itemsRemaining, itemAfter), Integer.parseInt(tokens[itemsRemaining-1]));
        }
        return applyOperation(operator, Integer.parseInt(itemAfter), Integer.parseInt(newItem));
    }

    public boolean checkIfOperator(String item) {
        return item.equals("+")
                || item.equals("-")
                || item.equals("*")
                || item.equals("/");
    }

    public int applyOperation(String operator, int a, int b) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }
}
