import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestConvertorUnitateMasura {
    private static ConvertorUnutateMasura convertorUnutateMasura;
    @BeforeAll
    public static void beforeAll(){
        convertorUnutateMasura=new ConvertorUnutateMasura();
        System.out.println("BeforeAll");
    }
    @Test
    public void testFahrenheiToCelsius(){
        double result=convertorUnutateMasura.ftc(35);
        Assertions.assertEquals(1.6666666666666667,result);
    }
}
