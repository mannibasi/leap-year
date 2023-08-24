import org.junit.jupiter.api.Test;
import org.katas.Year;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearShould {
    @Test
    public void return_false_if_not_divisible_by_4() {
        assertFalse(leapYear(1997));
    }

    @Test
    public void return_true_if_divisible_by_4() {
        assertTrue(leapYear(1996));
    }

    @Test
    public void return_true_if_divisible_by_400() {
        assertTrue(leapYear(1600));
    }

    private boolean leapYear(int year) {
        return new Year(year).isLeap();
    }
}
