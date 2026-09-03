import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testBasicPlan() {
        App app = new App();
        assertEquals(499.0, app.calculateBill("Basic", 40), 0.01);
    }

    @Test
    public void testExtraUsage() {
        App app = new App();
        assertEquals(599.0, app.calculateBill("Basic", 60), 0.01);
    }

    @Test
    public void testPremiumPlan() {
        App app = new App();
        assertEquals(1099.0, app.calculateBill("Premium", 150), 0.01);
    }
}
