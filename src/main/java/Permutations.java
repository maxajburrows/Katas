import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        HashSet<List<Integer>> seenPermutations = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> arrayCopy = new ArrayList<>();
            for (int j=0; j < nums.length; j++) {
                if (j != i) {
                    arrayCopy.add(nums[i]);
                }
            }
            List<List<Integer>> smallerArrayPermutations = smallerArray(arrayCopy);
            for (List<Integer> list : smallerArrayPermutations) {
                if (!seenPermutations.contains(list)) {
                    seenPermutations.add(list);
                    list.add(nums[i]);
                }
            }
        }
        return permutations;
    }

    private List<List<Integer>> smallerArray(List<Integer> reducedArray) {
        if (reducedArray.isEmpty()) {
            List<List<Integer>> emptyList = new ArrayList<>();
            emptyList.add(new ArrayList<>());
            return emptyList;
        }
        List<List<Integer>> permutations = new ArrayList<>();
        for (int i=0; i < reducedArray.size(); i++) {
            List<Integer> arrayCopy = new ArrayList<>();
            for (int j=0; j < reducedArray.size(); j++) {
                if (j != i) {
                    arrayCopy.add(reducedArray.get(i));
                }
            }
            List<List<Integer>> smallerArrayPermutations = smallerArray(arrayCopy);
            for (List<Integer> list : smallerArrayPermutations) {
                list.add(reducedArray.get(i));
            }
        }
        return permutations;
    }
}
