import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        List<int[]> characterCompositions = new ArrayList<>();
        for (String str : strs) {
            int[] characters = buildCharacterComposition(str);
            for (int i=0; i < characterCompositions.size(); i++) {
                if (Arrays.equals(characters, characterCompositions.get(i))) {
                    resultList.get(i).add(str);
                    break;
                }
            }
            resultList.add(new ArrayList<>(List.of(str)));
            characterCompositions.add(characters);
        }
        return resultList;
    }

    private int[] buildCharacterComposition(String str) {
        int [] characterFrequency = new int[26];
        for (char character : str.toCharArray()) {
            characterFrequency[character - 'a']++;
        }
        return characterFrequency;
    }
}
