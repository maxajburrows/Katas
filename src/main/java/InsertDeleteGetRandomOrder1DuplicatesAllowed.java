import java.util.ArrayList;
import java.util.HashMap;

public class InsertDeleteGetRandomOrder1DuplicatesAllowed {
    private ArrayList<HashMap<String, Integer>> randomNumbersList;

    public InsertDeleteGetRandomOrder1DuplicatesAllowed() {
        this.randomNumbersList = new ArrayList<>();
        HashMap<String, Integer> firstMap = new HashMap<String, Integer>();
        randomNumbersList.add(firstMap);
    }

    public boolean insert(int val) {
        boolean itemPresent = true;
        String newKey = String.valueOf(val);
        for (HashMap<String, Integer> map : randomNumbersList) {
            if (!map.containsKey(newKey)) {
                map.put(newKey, val);
                return itemPresent;
            }
            itemPresent = false;
        }
        HashMap<String, Integer> newMap = new HashMap<String, Integer>();
        newMap.put(newKey, val);
        randomNumbersList.add(newMap);
        return itemPresent;
    }

    public boolean remove(int val) {
        return true;
    }

    public int getRandom() {
        return 0;
    }
}
