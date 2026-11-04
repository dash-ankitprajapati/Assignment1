import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class subtractorTest {

    @Test
    public void testSubtract() {
        subtractor obj = new subtractor();
        assertEquals(5, obj.subtract(10, 5));
    }
}
