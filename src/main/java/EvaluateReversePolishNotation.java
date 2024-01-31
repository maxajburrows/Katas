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
                    stack.push((1/stack.pop()) * stack.pop());
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

}
