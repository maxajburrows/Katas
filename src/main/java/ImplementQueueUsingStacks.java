import java.util.Stack;

public class ImplementQueueUsingStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public ImplementQueueUsingStacks() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        int firstItem = stack1.pop();
        while (!stack1.isEmpty()) {
            stack2.push(firstItem);
            firstItem = stack1.pop();
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return firstItem;
    }

    public int peek() {
        int firstItem = 80085;
        while (!stack1.isEmpty()) {
            firstItem = stack1.pop();
            stack2.push(firstItem);
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return firstItem;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}
