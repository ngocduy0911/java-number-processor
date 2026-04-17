import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberProcessorTest {

    @Test
    void testStatementCoverage() {
        assertEquals(3, NumberProcessor.processNumber(2));
    }
}
