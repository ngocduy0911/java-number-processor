import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberProcessorTest {

    @Test
    void testStatementCoverage() {
        assertEquals(3, NumberProcessor.processNumber(2));
    }
    @Test
void testPath1() {
    assertEquals(0, NumberProcessor.processNumber(0));
}

@Test
void testPath2() {
    assertEquals(-1, NumberProcessor.processNumber(1));
}

@Test
void testPath3() {
    assertEquals(3, NumberProcessor.processNumber(5));
}
}
