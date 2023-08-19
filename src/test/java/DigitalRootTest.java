import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitalRootTest {

    @Test
    public void returns7For16() {
        DigitalRoot digitalRoot = new DigitalRoot();
        assertEquals(7, digitalRoot.reduceSums(16));
        assertEquals(7, digitalRoot.oneLiner(16));

    }

    @Test
    public void returns2For493193() {
        DigitalRoot digitalRoot = new DigitalRoot();
        assertEquals(2, digitalRoot.reduceSums(493193));
        assertEquals(2, digitalRoot.oneLiner(493193));
    }
}