import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }
        return permutations(numsList);
    }

    private List<List<Integer>> permutations(List<Integer> reducedArray) {
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
                    arrayCopy.add(reducedArray.get(j));
                }
            }
            List<List<Integer>> smallerArrayPermutations = permutations(arrayCopy);
            for (List<Integer> list : smallerArrayPermutations) {
                list.add(reducedArray.get(i));
                permutations.add(list);
            }
        }
        return permutations;
    }
}
