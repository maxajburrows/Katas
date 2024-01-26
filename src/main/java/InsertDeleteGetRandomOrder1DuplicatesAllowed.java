import java.util.*;

public class InsertDeleteGetRandomOrder1DuplicatesAllowed {

    private ArrayList<Integer> numbersList;
    private HashMap<Integer, HashSet<Integer>> indexMap;
    private Random random;

    public InsertDeleteGetRandomOrder1DuplicatesAllowed() {
        this.numbersList = new ArrayList<>();
        this.indexMap = new HashMap<Integer, HashSet<Integer>>();
        this.random = new Random();
    }

    public boolean insert(int val) {
        if (!indexMap.containsKey(val)) {
            indexMap.put(val, new HashSet<>(List.of(numbersList.size())));
            numbersList.add(val);
            System.out.println(indexMap.toString());
            return true;
        }
        indexMap.get(val).add(numbersList.size());;
        numbersList.add(val);
        System.out.println(indexMap.toString());
        return false;
    }

    public boolean remove(int val) {
        if (!indexMap.containsKey(val)) {
            return false;
        }

        HashSet<Integer> indexList = indexMap.get(val);
        int indexToRemove = indexList.iterator().next();

        if (indexList.size() == 1) {
            indexMap.remove(val);
        } else {
            indexList.remove(indexToRemove);
        }

        int lastIndex = numbersList.size()-1;

        if (indexToRemove != lastIndex) {
            Integer lastValue = numbersList.get(lastIndex);
            numbersList.set(indexToRemove, lastValue);
            HashSet<Integer> lastValueIndexes = indexMap.get(lastValue);
            lastValueIndexes.remove(lastIndex);
            lastValueIndexes.add(indexToRemove);
        }
        numbersList.remove(lastIndex);

        System.out.println(numbersList);
        System.out.println(indexMap.toString());
        return true;
    }


    public int getRandom() {
        int randomIndex = random.nextInt(numbersList.size());
        return numbersList.get(randomIndex);
    }
}
