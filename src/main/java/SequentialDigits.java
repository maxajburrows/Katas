import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> resultList = new ArrayList<>();
        OUTER:
        for (int integer=low; integer <= high; integer++) {
            Integer[] splitInt = Arrays.stream(String.valueOf(integer)
                            .split(""))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
            for (int j = 0; j < splitInt.length - 1; j++) {
                if (!splitInt[j].equals(splitInt[j+1]-1)) {
                    continue OUTER;
                }
            }
            resultList.add(integer);
        }
        return resultList;
    }
}
