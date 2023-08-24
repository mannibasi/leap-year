import org.junit.jupiter.api.Test;
import org.katas.Year;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearShould {
    @Test
    public void return_false_if_not_divisible_by_4() {
        Year year = new Year(1997);
        assertFalse(year.isLeap());
    }

    @Test
    public void return_true_if_divisible_by_4() {
        Year year = new Year(1996);
        assertTrue(year.isLeap());
    }

    @Test
    public void return_true_if_divisible_by_400() {
        Year year = new Year(1600);
        assertTrue(year.isLeap());
    }
}
