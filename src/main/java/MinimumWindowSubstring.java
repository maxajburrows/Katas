public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        // Loop through s once increasing the range as you go
        String resultString = "";
        for (int l=0; l < s.length() - t.length(); l++) {
            String[] splitT = t.split("");
            for (int i=l+t.length(); i <= s.length(); i++) {
                String testString = s.substring(l, i);
                String[] splitTestString = testString.split("");
                int containedLetters = 0;
                for (int j=0; j < splitT.length; j++) {
                    for (int k=0; k < splitTestString.length; k++) {
                        if (splitT[j].equals(splitTestString[k])) {
                            containedLetters++;
                            break;
                        }
                    }
                }
                if (l == 0 && containedLetters == splitT.length) {
                    resultString = testString;
                }
                if (containedLetters == splitT.length && testString.length() < resultString.length()) {
                    resultString = testString;
                }
            }
            if (resultString.isEmpty()) {
                return resultString;
            }
        }
        return resultString;
    }
}
