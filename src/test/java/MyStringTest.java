import org.example.MyString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MyStringTest {
    @Test
    public void method1Test() {
        MyString str = new MyString();
        int result = str.method1("Radu are mere!");
        Assertions.assertEquals(result, 14);

    }

    @Test
    public void method2Test() {
        MyString s = new MyString();
        String result = s.method2("Radu", "Ana", "Marc");
        Assertions.assertEquals(result, "Radu Ana Marc");

    }

    @Test
    public void method3() {
        MyString x = new MyString();
        boolean result1 = x.method3("iadu");
        boolean result2 = x.method3("Radu");
        Assertions.assertTrue(result1);
        Assertions.assertFalse(result2);
    }


    @Test
    public void method4() {
        MyString invers = new MyString();
        String result = invers.method4("Radu");
        Assertions.assertEquals(result, "udaR");
    }
}