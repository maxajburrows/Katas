import java.util.ArrayList;

public class CheapestFlightsWithKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] graphArray = new int[n][n];

        for (int[] flight : flights) {
            graphArray[flight[0]][flight[1]] = flight[2];
        }
        return shortestPath(graphArray, src, dst, k, 0, 0);
    }

    private int shortestPath(int[][] graphArray, int src, int dst, int k, int total, int steps) {
        if (src == dst) {
            return total;
        }
        if (steps > k) {
            return Integer.MAX_VALUE;
        }
        ArrayList<Integer> paths = new ArrayList<>();
        for (int j=0; j < graphArray[src].length; j++) {
            if (graphArray[src][j] != 0) {
                paths.add(shortestPath(graphArray, j, dst, k, total+graphArray[src][j], steps+1));
            }
        }
        int shortestPath = Integer.MAX_VALUE;
        for (int path : paths) {
            shortestPath = Math.min(path, shortestPath);
        }
        return (shortestPath == Integer.MAX_VALUE) ? -1 : shortestPath;
    }
}
