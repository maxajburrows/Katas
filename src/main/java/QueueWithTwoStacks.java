import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class QueueWithTwoStacks {
    Stack<String> STACK1 = new Stack<String>();
    public void readInput() {
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            br.readLine();
            while ((line = br.readLine()) != null) {
                handleRequest(line.toString(), STACK1);
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }

    public void handleRequest(String request, Stack<String> STACK1) {
        Stack<String> STACK2 = new Stack<String>();
        if (request.charAt(0) == '1') {
            for (int i = 0; i < STACK1.size(); i++) {
                if (STACK1.size() > 0) {
                    STACK2.push(STACK1.pop());
                }
            }
            STACK1.push(request.substring(2));
            for (int j = 0; j < STACK1.size(); j++) {
                if (STACK2.size() > 0) {
                    STACK1.push(STACK2.pop());
                }
            }
        } else if (request.charAt(0) == '2') {
            STACK1.pop();
        } else {
            System.out.println(STACK1.peek());
        }
    }
}
