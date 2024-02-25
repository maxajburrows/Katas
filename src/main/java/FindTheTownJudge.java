import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) {
            return 1;
        }

        HashMap<Integer, Integer> possibleJudgeMap = new HashMap<>();
        for (int[] person : trust) {
            possibleJudgeMap.merge(person[1], 1, Integer::sum);
        }
        for (int[] person : trust) {
            possibleJudgeMap.remove(person[0]);
        }

        for (Map.Entry<Integer, Integer> possibleJudge : possibleJudgeMap.entrySet()) {
            if (possibleJudge.getValue() == n-1) {
                return possibleJudge.getKey();
            }
        }
        return -1;
    }
}
