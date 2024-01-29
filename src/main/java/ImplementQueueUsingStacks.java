import java.util.Stack;

public class ImplementQueueUsingStacks {
    Stack<Integer> inputStack;
    Stack<Integer> outputStack;

    public ImplementQueueUsingStacks() {
        inputStack = new Stack<Integer>();
        outputStack = new Stack<Integer>();
    }

    public void push(int x) {
        while (!outputStack.isEmpty()) {
            inputStack.push(outputStack.pop());
        }
        outputStack.push(x);
    }

    public int pop() {
        while (!inputStack.isEmpty()) {
            outputStack.push(inputStack.pop());
        }
        return outputStack.pop();
    }

    public int peek() {
        while (!inputStack.isEmpty()) {
            outputStack.push(inputStack.pop());
        }
        return outputStack.peek();
    }

    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
