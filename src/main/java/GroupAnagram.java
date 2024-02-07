import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        List<HashMap<Character, Integer>> characterCompositions = new ArrayList<>();
        OUTER:
        for (String str : strs) {
            HashMap<Character, Integer> characters = buildCharacterComposition(str);
            if (characterCompositions.isEmpty()) {
                resultList.add(new ArrayList<>(List.of(str)));
                characterCompositions.add(characters);
                continue;
            }
            for (int i=0; i < characterCompositions.size(); i++) {
                if (characters.equals(characterCompositions.get(i))) {
                    resultList.get(i).add(str);
                    continue OUTER;
                }
            }
            resultList.add(new ArrayList<>(List.of(str)));
            characterCompositions.add(characters);
        }
        return resultList;
    }

    private HashMap<Character, Integer> buildCharacterComposition(String str) {
        HashMap<Character, Integer> characters = new HashMap<>();
        for (char character : str.toCharArray()) {
            characters.merge(character, 1, Integer::sum);
        }
        return characters;
    }

    public List<List<String>> groupAnagramsArray(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        List<int[]> characterCompositions = new ArrayList<>();
        OUTER:
        for (String str : strs) {
            int[] characters = buildCharacterCompositionArray(str);
            if (characterCompositions.isEmpty()) {
                resultList.add(new ArrayList<>(List.of(str)));
                characterCompositions.add(characters);
                continue;
            }
            for (int i=0; i < characterCompositions.size(); i++) {
                if (Arrays.equals(characters, characterCompositions.get(i))) {
                    resultList.get(i).add(str);
                    continue OUTER;
                }
            }
            resultList.add(new ArrayList<>(List.of(str)));
            characterCompositions.add(characters);
        }
        return resultList;
    }

    private int[] buildCharacterCompositionArray(String str) {
        int [] characterFrequency = new int[26];
        for (char character : str.toCharArray()) {
            characterFrequency[character - 'a']++;
        }
        return characterFrequency;
    }
}
