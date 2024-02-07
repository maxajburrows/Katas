import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacter {
    public int firstUniqCharNestedLoop(String s) {
        // TODO: Solution is n2 time complexity - can it be improved.
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

    public int firstUniqCharHashMap(String s) {
        HashMap<Character, Integer> characterMap = new HashMap<>();
        Set<Integer> duplicatedSet = new HashSet<>();
        for (int i=0; i < s.length(); i++) {
            if (characterMap.containsKey(s.charAt(i))) {
                duplicatedSet.add(characterMap.get(s.charAt(i)));
                duplicatedSet.add(i);
                continue;
            }
            characterMap.put(s.charAt(i), i);
        }
        for (int i=0; i < s.length(); i++) {
            if (!duplicatedSet.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public int firstUniqChar(String s) {
        int [] characterFrequency = new int[26];
        for (char character : s.toCharArray()) {
            characterFrequency[character - 'a']++;
        }
        for (int i=0; i < s.length(); i++) {
            if (characterFrequency[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
