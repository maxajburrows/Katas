import java.util.Stack;

public class IMCKata1 {

    Stack<Integer> STACK = new Stack<Integer>();
    public static void mainFunc() {

    }

    public void push(int v) {
        // Complete the function below:
        STACK.push(v);
        STACK.empty();
        String vString = String.valueOf(v) + " " + String.valueOf(v);
        System.out.println("EMPTY");
        //throw new UnsupportedOperationException("push not implemented");
    }


}
