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
        int actualResult = cheapestFlightsWithKStops.findCheapestPrice(n, flights, src, 3, 1);
        assertEquals(expectedResult, actualResult);
    }

}