import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        String removeKey = String.valueOf(val);
        for (int i = randomNumbersList.size()-1; i >= 0; i--) {
            HashMap<String, Integer> currentMap = randomNumbersList.get(i);
            if (currentMap.containsKey(removeKey)) {
                currentMap.remove(removeKey);
                return true;
            }
        }
        return false;
    }

    public int getRandom() {
        int mapIndexToQuery = (int) (Math.random()*randomNumbersList.size());
        HashMap<String, Integer> mapToQuery = randomNumbersList.get(mapIndexToQuery);
        int mapIndexToGet = (int) (Math.random()*mapToQuery.size());
        int value = 0;
        int counter = 0;
        for (String key : mapToQuery.keySet()) {
            if (counter == mapIndexToGet) {
                value = mapToQuery.get(key);
                return value;
            }
            counter++;
        }
        return value;
    }
}
