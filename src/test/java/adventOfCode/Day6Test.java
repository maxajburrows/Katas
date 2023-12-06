package adventOfCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day6Test {

    @Test
    public void fullTestCase() {
        int[] times = new int[] {7, 15, 30};
        int[] distances = new int[] {9, 40, 200};
        int result = Day6.multipliedRaces(times, distances);
        assertEquals(288, result);
    }

    @Test
    public void question() {
        int[] times = new int[] {55, 99, 97, 93};
        int[] distances = new int[] {401, 1485, 2274, 1405};
        int result = Day6.multipliedRaces(times, distances);
        assertEquals(2374848, result);
    }

    @Test
    public void fullTestCasePart2() {
        int[] times = new int[] {7, 15, 30};
        int[] distances = new int[] {9, 40, 200};
        int result = Day6.longRace(times, distances);
        assertEquals(71503, result);
    }

    @Test
    public void questionPart2() {
        int[] times = new int[] {55, 99, 97, 93};
        int[] distances = new int[] {401, 1485, 2274, 1405};
        int result = Day6.longRace(times, distances);
        System.out.println(result);
        //assertEquals(2374848, result);
    }
}