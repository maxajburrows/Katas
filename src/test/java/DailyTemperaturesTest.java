import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {
    @Test
    void test1() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = new int[]{73,74,75,71,69,72,76,73};
        int[] expectedResult = new int[]{1,1,4,2,1,1,0,0};
        int[] actualResult = dailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void test2() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = new int[]{34,80,80,80,34,80,80,80,34,34};
        int[] expectedResult = new int[]{1,0,0,0,1,0,0,0,0,0};
        int[] actualResult = dailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void test3() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = new int[]{80,80,80,34,80,80,34,80,80,80};
        int[] expectedResult = new int[]{1,0,0,0,1,0,0,0,0,0};
        int[] actualResult = dailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void test4() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = new int[]{34,80,80,80,34,80,80,80,34,34};
        int[] expectedResult = new int[]{1,0,0,0,1,0,0,0,0,0};
        int[] actualResult = dailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void test5() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = new int[]{76,76,76,76,76};
        int[] expectedResult = new int[]{0,0,0,0,0};
        int[] actualResult = dailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expectedResult, actualResult);
    }
}