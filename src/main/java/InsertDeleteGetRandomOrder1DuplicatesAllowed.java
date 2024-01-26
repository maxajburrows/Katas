import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class InsertDeleteGetRandomOrder1DuplicatesAllowed {

    private ArrayList<HashMap<String, Integer>> randomNumbersMapHolder;

    public InsertDeleteGetRandomOrder1DuplicatesAllowed() {
        this.randomNumbersMapHolder = new ArrayList<>();
        HashMap<String, Integer> firstMap = new HashMap<String, Integer>();
        randomNumbersMapHolder.add(firstMap);
    }

    public boolean insert(int val) {
        boolean itemPresent = true;
        String newKey = String.valueOf(val);
        for (HashMap<String, Integer> map : randomNumbersMapHolder) {
            if (!map.containsKey(newKey)) {
                map.put(newKey, val);
                return itemPresent;
            }
            itemPresent = false;
        }
        HashMap<String, Integer> newMap = new HashMap<String, Integer>();
        newMap.put(newKey, val);
        randomNumbersMapHolder.add(newMap);
        return itemPresent;
    }

    public boolean remove(int val) {
        String removeKey = String.valueOf(val);
        for (int i = randomNumbersMapHolder.size()-1; i >= 0; i--) {
            HashMap<String, Integer> currentMap = randomNumbersMapHolder.get(i);
            if (currentMap.containsKey(removeKey)) {
                currentMap.remove(removeKey);
                if (currentMap.isEmpty()) {
                    randomNumbersMapHolder.remove(i);
                }
                return true;
            }
        }
        return false;
    }

    public int getRandom2() {
        int totalValues = 0;
        ArrayList<Integer> mapChooser = new ArrayList<>();
        for (HashMap<String, Integer> map : randomNumbersMapHolder) {
            totalValues += map.size();
        }
        int numToQuery = (int) (Math.random()*totalValues);
        for (HashMap<String, Integer> map : randomNumbersMapHolder) {
            if (map.size() > numToQuery) {
                int counter = 0;
                for (Integer currentValue : map.values()) {
                    if (counter == numToQuery) {
                        return currentValue;
                    }
                    counter++;
                }
            }
            numToQuery -= map.size();
        }
        return 80085;
    }


    public int getRandom() {
        int mapIndexToQuery = (int) (Math.random()*randomNumbersMapHolder.size());
        HashMap<String, Integer> mapToQuery = randomNumbersMapHolder.get(mapIndexToQuery);
        int mapIndexToGet = (int) (Math.random()*mapToQuery.size());
        int counter = 0;
        for (Integer currentValue : mapToQuery.values()) {
            if (counter == mapIndexToGet) {
                return currentValue;
            }
            counter++;
        }
        return 80085;
    }
}
