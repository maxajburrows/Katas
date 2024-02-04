import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        String resultString = "";
        for (int l=0; l <= s.length() - t.length(); l++) {
            String[] splitT = t.split("");
            for (int i=l+t.length(); i <= s.length(); i++) {
                String testString = s.substring(l, i);
                ArrayList<String> splitTestString = new ArrayList<String>(Arrays.asList(testString.split("")));
                int containedLetters = 0;
                for (int j=0; j < splitT.length; j++) {
                    for (int k=0; k < splitTestString.size(); k++) {
                        if (splitT[j].equals(splitTestString.get(k))) {
                            containedLetters++;
                            splitTestString.remove(k);
                            break;
                        }
                    }
                }
                if (l == 0 && containedLetters == splitT.length) {
                    resultString = testString;
                    break;
                }
                if (containedLetters == splitT.length && testString.length() < resultString.length()) {
                    resultString = testString;
                    break;
                }
            }
            if (resultString.isEmpty()) {
                return resultString;
            }
        }
        return resultString;
    }
}
