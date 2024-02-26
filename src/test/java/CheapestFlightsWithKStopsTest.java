import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheapestFlightsWithKStopsTest {

    CheapestFlightsWithKStops cheapestFlightsWithKStops = new CheapestFlightsWithKStops();
    @Test
    void test1() {
        int n = 4;
        int[][] flights = {
                {0,1,100},
                {1,2,100},
                {1,3,600},
                {2,3,200},
        };
        int src = 0;
        int dst = 3;
        int k = 1;
        int expectedResult = 700;
        int actualResult = cheapestFlightsWithKStops.findCheapestPrice(n, flights, src, dst, k);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test2() {
        int n = 10;
        int[][] flights = {
                {3,4,4},
                {2,5,6},
                {4,7,10},
                {9,6,5},
                {7,4,4},
                {6,2,10},
                {6,8,6},
                {7,9,4},
                {1,5,4},
                {1,0,4},
                {9,7,3},
                {7,0,5},
                {6,5,8},
                {1,7,6},
                {4,0,9},
                {5,9,1},
                {8,7,3},
                {1,2,6},
                {4,1,5},
                {5,2,4},
                {1,9,1},
                {7,8,10},
                {0,4,2},
                {7,2,8}
        };
        int src = 6;
        int dst = 0;
        int k = 7;
        int expectedResult = 14;
        int actualResult = cheapestFlightsWithKStops.findCheapestPrice(n, flights, src, dst, k);
        assertEquals(expectedResult, actualResult);
    }

}