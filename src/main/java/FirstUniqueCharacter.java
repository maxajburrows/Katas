public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        OUTER:
        for (int i=0; i < s.length(); i++) {
            char testChar = s.charAt(i);
            for (int j=0; j < s.length(); j++) {
                if (testChar == s.charAt(j) && i != j) {
                    continue OUTER;
                }
            }
            return i;
        }
        return -1;
    }
}
