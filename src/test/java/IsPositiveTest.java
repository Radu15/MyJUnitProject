import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveTest {
    @Test
    public void testCheckIsPOsitive() {
        IsPositive isPositive = new IsPositive();
        boolean result = isPositive.checkIsPositive(6);
        Assertions.assertTrue(result);


    }

    @Test
    public void tesCheckIsNegative() {
        IsPositive isNegative = new IsPositive();
        boolean result = isNegative.checkIsPositive(-3);
        Assertions.assertFalse(result);
    }

}
