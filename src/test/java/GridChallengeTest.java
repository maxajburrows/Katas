import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridChallengeTest {

    @Test
    public void returns7For16() {
        GridChallenge gridChallenge = new GridChallenge();
        System.out.println(gridChallenge.sortRow("afqbcd"));
//        assertEquals(7, digitalRoot.reduceSums(16));
    }
}