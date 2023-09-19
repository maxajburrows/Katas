import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GridChallengeTest {
    @Test
    public void sortsOneRow() {
        System.out.println(GridChallenge.sortRow("afqbcd"));
    }

    @Test
    public void wholeCheck() {
        List<String> grid = Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv");
        System.out.println(GridChallenge.gridChallenge(grid));
    }
}