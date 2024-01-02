import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClculatorTest {
    private static Calculator calculator;

    Calculator();

    calculator =new

    @BeforeAll
    private static void BeforeAllMethod() {

    }

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        calculator.add(2, 3);
        int result = calculator.add(2, 3);
        Assertions.assertEquals(result, 5);
    }

    public void diffTest() {
        Calculator calculator = new Calculator();
        calculator.add(4, 2);
        int result = calculator.add(4, 2);
        Assertions.assertEquals(result, 2);
    }

    public void multiplyTest() {
        Calculator calculator = new Calculator();
        calculator.add(4, 2);
        int result = calculator.add(4, 2);
        Assertions.assertEquals(result, 8);
    }

    public void divideTest() {
        Calculator calculator = new Calculator();
        calculator.add(4, 2);
        int result = calculator.add(4, 2);
        Assertions.assertEquals(result, 2);
    }
}
