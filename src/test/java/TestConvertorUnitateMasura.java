import org.junit.jupiter.api.*;

public class TestConvertorUnitateMasura {
    private static ConvertorUnutateMasura convertorUnutateMasura;
    @BeforeAll
    public static void beforeAll(){
        convertorUnutateMasura=new ConvertorUnutateMasura();
        System.out.println("BeforeAll");
    }

    @BeforeEach
    public void beforeMetoda() {
        System.out.println("BeforeEach metoda");
    }
    @Test
    public void testFahrenheiToCelsius(){
        double result=convertorUnutateMasura.ftc(35);
        Assertions.assertEquals(1.6666666666666667,result);
    }

    @AfterEach
    public void afterMetota() {
        System.out.println("After metoda");
    }

    @Test
    public void milesToKilometersTest() {
        double result = convertorUnutateMasura.milesToKilometers(2);
        Assertions.assertEquals(3.218688, result, 0.01);
    }

    @Disabled("Ignoring this test")
    @Test
    public void poundsToKilograms() {
        double result = convertorUnutateMasura.poundsToKilograms(7);
        Assertions.assertEquals(3.17514659, result);
    }

    @Test
    public void gallonsToLiters() {
        double result = convertorUnutateMasura.gallonsToLiters(5);
        Assertions.assertEquals(18.92705892, result);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("executing AfterEach method");
    }
}
