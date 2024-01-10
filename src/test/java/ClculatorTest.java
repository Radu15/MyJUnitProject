import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void beforeAllMethod() {
        calculator = new Calculator();
        System.out.println("Before all");
    }

    // @BeforeEach
    // public void beforeEach(){
    //     System.out.println("Before each");
    // }

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        calculator.add(2, 3);
        int result = calculator.add(2, 3);
        Assertions.assertEquals(result, 5);
    }

    @Test
    public void diffTest() {
        Calculator calculator = new Calculator();
        calculator.add(4, 2);
        int result = calculator.add(4, 2);
        Assertions.assertEquals(result, 2);
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        calculator.add(4, 2);
        int result = calculator.add(4, 2);
        Assertions.assertEquals(result, 8);
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        calculator.add(4, 2);
        int result = calculator.add(4, 2);
        Assertions.assertEquals(result, 2);
    }

    @Test
    public void moduloTest() {
        double result = calculator.modulo(9, 2);
        Assertions.assertEquals(1, result);
    }
    // @AfterEach
    //  public void afterEach(){
    //   System.out.println("After each");
    // }
    // @AfterAll
    // public static void afterAll(){
    //    System.out.println("After all");
    // }
}
