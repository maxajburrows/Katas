public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        // Loop through s once increasing the range as you go
        String[] splitT = t.split("");
        for (int i=t.length(); i <= s.length(); i++) {
            String testString = s.substring(0, i);
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
            if (containedLetters == splitT.length) {
                return testString;
            }
        }
        return "";
    }
}
