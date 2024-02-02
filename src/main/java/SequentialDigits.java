import java.util.*;
import java.util.stream.IntStream;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> resultList = new ArrayList<>();
        for (int i=1; i <= 9; i++) {
            int number = i;
            for (int j=i+1; j <=9; j++) {
                number = number*10 + j;
                if (number > high) {
                    break;
                }
                if (number >= low) {
                    resultList.add(number);
                }
            }
        }
        Collections.sort(resultList);
        return resultList;
    }
}
