package adventOfCode;

import java.util.Arrays;

public class Day6 {

    public static int multipliedRaces(int[] times, int[] distances) {
        int successMultiplier = 1;
        for (int i=0; i < times.length; i++) {
            successMultiplier *= raceSuccess(times[i], distances[i]);
        }
        return successMultiplier;
    }

    public static int raceSuccess(int raceTime, int recordDistance) {
        int successCounter = 0;
        for (int i=0; i <= raceTime; i++) {
            int movingTime = raceTime - i;
            int distanceTravelled = i*movingTime;
            if (distanceTravelled > recordDistance) {
                successCounter++;
            }
        }
        return successCounter;
    }
}
