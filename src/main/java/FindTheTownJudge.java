import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer, Integer> possibleJudgeMap = new HashMap<>();
        for (int i=0; i < trust.length; i++) {
            possibleJudgeMap.merge(trust[i][1], 1, Integer::sum);
            possibleJudgeMap.remove(trust[i][0]);
        }

        for (Map.Entry<Integer, Integer> possibleJudge : possibleJudgeMap.entrySet()) {
            if (possibleJudge.getValue() == n-1) {
                return possibleJudge.getKey();
            }
        }
        return -1;
    }
}
