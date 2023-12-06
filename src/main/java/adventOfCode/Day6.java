package adventOfCode;

import java.util.Arrays;

public class Day6 {

    public static int longRace(int[] times, int[] distances) {
        long longTime = Long.parseLong(Arrays.stream(times)
                .mapToObj(Integer::toString)
                .reduce("", String::concat));
        long longDistance = Long.parseLong(Arrays.stream(distances)
                .mapToObj(Integer::toString)
                .reduce("", String::concat));
        return raceSuccess(longTime, longDistance);
    }

    public static int multipliedRaces(int[] times, int[] distances) {
        int successMultiplier = 1;
        for (int i=0; i < times.length; i++) {
            successMultiplier *= raceSuccess(times[i], distances[i]);
        }
        return successMultiplier;
    }

    public static int raceSuccess(long raceTime, long recordDistance) {
        int successCounter = 0;
        for (int i=0; i <= raceTime; i++) {
            long distanceTravelled = i*(raceTime - i);
            if (distanceTravelled > recordDistance) {
                successCounter++;
            }
        }
        return successCounter;
    }
}
