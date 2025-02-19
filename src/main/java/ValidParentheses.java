import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> parenthesesStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                parenthesesStack.push(c);
            } else if (parenthesesStack.isEmpty()) {
                return false;
            } else if (c == ')' && parenthesesStack.pop() != '(') {
                return false;
            } else if (c == ']' && parenthesesStack.pop() != '[') {
                return false;
            } else if (c == '}' && parenthesesStack.pop() != '{') {
                return false;
            }
        }
        return parenthesesStack.isEmpty();
    }
}
