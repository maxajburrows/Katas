import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindTheTownJudge {

    // Viewing trust array as a graph with the trust pairs as directed edges.
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) {
            return 1;
        }

        int[] trustCount = new int[n+1];
        for (int[] person : trust) {
            trustCount[person[0]]--;
            trustCount[person[1]]++;
        }

        for (int i=0; i < trustCount.length; i++) {
            if (trustCount[i] == n-1) {
                return i;
            }
        }
        return -1;
    }


    public int findJudgeFirstAttempt(int n, int[][] trust) {
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
