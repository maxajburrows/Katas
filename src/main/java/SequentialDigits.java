import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> resultList = new ArrayList<>();
        OUTER:
        for (int integer=low; integer <= high; integer++) {
//            char[] splitChars = String.valueOf(integer).toCharArray();
            List<Integer> splitInt = new ArrayList<>();
            splitInteger(integer, splitInt);
//            for (int i=0; i < splitChars.length; i++) {
//                splitInt[i] = Character.getNumericValue(splitChars[i]);
//            }
            for (int j = 0; j < splitInt.size() - 1; j++) {
                if (!splitInt.get(j).equals(splitInt.get(j+1)-1)) {
                    continue OUTER;
                }
            }
            resultList.add(integer);
            while (!splitInt.get(splitInt.size()-1).equals(9) && integer <= high) {
                for (int i=0; i < splitInt.size(); i++) {
                    splitInt.set(i, splitInt.get(i)+1);
                }
                integer = convertToInt(splitInt);
                if (integer <= high) {
                    resultList.add(integer);
                }
            }
            //integer += (int) Math.pow(10, splitInt.size()-1);
        }
        return resultList;
    }

    private int convertToInt(List<Integer> splitInt) {
        int result = 0;
        for (Integer digit : splitInt) {
            result = result*10 + digit;
        }
        return result;
    }

    private void splitInteger(int integer, List<Integer> splitInt) {
        if (integer / 10 > 0) {
            splitInteger(integer/10, splitInt);
        }
        splitInt.add(integer % 10);
    }
}
