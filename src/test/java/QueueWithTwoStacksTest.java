import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithTwoStacksTest {

    String[] input = new String[]{
            "10000",
            "1 457195258",
            "1 599815942",
            "2",
            "1 618245704,",
            "3",
            "3",
            "1 858351780",
            "1 675701964",
            "1 20413511",
            "2",
            "1 464784369",
            "1 808281803",
            "3",
            "1 963943212",
            "1 704262331",
            "1 789783636",
            "1 624169949",
            "2"
    };

    @Test
    public void checkOutput() {
        Stack<String> STACk = new Stack<String>();
        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        for (int i=0; i < input.length; i++) {
            queue.handleRequest(input[i], STACk);
        }
    }

}