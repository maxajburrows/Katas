import java.util.*;
import java.util.stream.IntStream;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> resultList = new ArrayList<>();
        for (int i=1; i <= 9; i++) {
            int number = i;
            int nextDigit = i + 1;
            while (nextDigit <= 9 && number <= high) {
                number = number*10 + nextDigit;
                if (number >= low && number <= high) {
                    resultList.add(number);
                }
                nextDigit++;
            }
        }
        Collections.sort(resultList);
        return resultList;
    }
}
