import java.util.ArrayDeque;
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> indexStack = new ArrayDeque<>();
        int length = temperatures.length;
        int[] answersArray = new int[length];
        for (int i = length-1; i >=0; i--) {
            while (!indexStack.isEmpty() && temperatures[i] > temperatures[indexStack.peek()]) {
                indexStack.pop();
            }
            if (!indexStack.isEmpty()) {
                answersArray[i] = indexStack.peek()-i;
            }
            indexStack.push(i);
        }
        return answersArray;
    }
}