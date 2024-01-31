import java.util.Objects;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    Stack<Integer> stack = new Stack<>();
    public int evalRPN(String[] tokens) {
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(- stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int denominator = stack.pop();
                    int numerator = stack.pop();
                    stack.push(numerator / denominator);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}