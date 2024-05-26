import org.example.*;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void testEveryBranch() {
        // 1: Празна листа
        Exception exception1 = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(Collections.emptyList(), 0);
        });
        assertEquals("allItems list can't be null!", exception1.getMessage());

        // 2: Нема баркод
        Exception exception2 = assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(Arrays.asList(new SILab2.Item("Item1", null, 150, 5.0f)), 80);
        });
        assertEquals("No barcode!", exception2.getMessage());

        // 3: True
        assertTrue(SILab2.checkCart(Arrays.asList(new SILab2.Item("Item2", "9876", 80, 0.0f)), 80));

        // 4: True
        assertTrue(SILab2.checkCart(Arrays.asList(new SILab2.Item("Item3", "0123", 300, 15.0f)), 200));

        // 5: Нема име
        assertTrue(SILab2.checkCart(Arrays.asList(new SILab2.Item("", "1234", 200, 10.0f)), 100));
    }

    @Test
    public void testMultipleCondition() {
        // T && T && T
        assertThrows(RuntimeException.class, () -> {
            SILab2.checkCart(Arrays.asList(new SILab2.Item("Item", "0123", 350, 10.0f)), 500);
        });

        // T && T && F
        assertTrue(SILab2.checkCart(Arrays.asList(new SILab2.Item("Item", "1123", 350, 10.0f)), 500));

        // T && F && T
        assertTrue(SILab2.checkCart(Arrays.asList(new SILab2.Item("Item", "0123", 350, 0.0f)), 500));

        // T && F && F
        assertTrue(SILab2.checkCart(Arrays.asList(new SILab2.Item("Item", "1123", 350, 0.0f)), 500));

        // F && T && T
        assertTrue(SILab2.checkCart(Arrays.asList(new SILab2.Item("Item", "0123", 250, 10.0f)), 500));

        // F && T && F
        assertTrue(SILab2.checkCart(Arrays.asList(new SILab2.Item("Item", "1123", 250, 10.0f)), 500));

        // F && F && T
        assertTrue(SILab2.checkCart(Arrays.asList(new SILab2.Item("Item", "0123", 250, 0.0f)), 500));

        // F && F && F
        assertTrue(SILab2.checkCart(Arrays.asList(new SILab2.Item("Item", "1123", 250, 0.0f)), 500));
    }
}