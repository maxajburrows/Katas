import java.util.HashSet;

public class NumTilePossibilities {
    public int numTilePossibilities(String tiles) {
        int numDuplicates = findNumDuplicates(tiles);
        return 0;
    }

    private static int findNumDuplicates(String tiles) {
        HashSet<Character> orginalLetters = new HashSet<>();
        int numDuplicates = 0;
        for (char letter : tiles.toCharArray()) {
            if (orginalLetters.contains(letter)) {
                numDuplicates++;
                continue;
            }
            orginalLetters.add(letter);
        }
        return numDuplicates;
    }
}
