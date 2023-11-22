import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KnightsShortestPathTest {
    @Test
    public void sampleTests() {
        assertEquals(2, KnightsShortestPath.knight("a1", "c1"));
        assertEquals(3, KnightsShortestPath.knight("a1", "f1"));
        assertEquals(3, KnightsShortestPath.knight("a1", "f3"));
        assertEquals(4, KnightsShortestPath.knight("a1", "f4"));
        assertEquals(5, KnightsShortestPath.knight("a1", "f7"));
    }
}