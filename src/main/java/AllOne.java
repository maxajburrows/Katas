import java.util.HashMap;

public class AllOne {
    HashMap<String, Integer> keyMap = new HashMap<>();
    int max = 1;
    int min = 1;
    String maxKey = "";
    String minKey = "";
    public AllOne() {
    }

    public void inc(String key) {
        if (keyMap.containsKey(key)) {
            int value = keyMap.get(key);
            if (value == max) {
                max++;
                maxKey = key;
            }
            keyMap.put(key, keyMap.get(key) + 1);
            return;
        }
        if (keyMap.isEmpty()) {
            maxKey = key;
        }
        keyMap.put(key, 1);
        minKey = key;
    }

    public void dec(String key) {
        if (keyMap.get(key) == 1) {
            keyMap.remove(key);
            return;
        }
        int value = keyMap.get(key);
        if (value == min) {
            min--;
            minKey = key;
        }
        keyMap.put(key, keyMap.get(key) - 1);
    }

    public String getMaxKey() {
        return maxKey;
    }

    public String getMinKey() {
        return minKey;
    }
}
