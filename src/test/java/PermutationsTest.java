import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PermutationsTest {

    private static Permutations permutations;

    @BeforeAll
    static void setUp() {
        permutations = new Permutations();
    }

    @Test
    void test1() {
        int[] input = { 1, 2, 3 };
        Permutations permutations = new Permutations();
        List<List<Integer>> result = permutations.permute(input);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1, 2, 3));
        expected.add(List.of(1, 3, 2));
        expected.add(List.of(2, 1, 3));
        expected.add(List.of(2, 3, 1));
        expected.add(List.of(3, 1, 2));
        expected.add(List.of(3, 2, 1));
        assertEquals(expected, result);
    }

}
