import java.util.ArrayList;
import java.util.Arrays;

public class WhichAreIn {

    public String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> output = new ArrayList<>();
        for (String word : array1) {
            for (String longWord : array2) {
                if (longWord.contains(word)) {
                    output.add(word);
                    break;
                }
            }
        }
        String[] outputStrings = output.toArray(new String[0]);
        Arrays.sort(outputStrings);
        return outputStrings;
    }
}
