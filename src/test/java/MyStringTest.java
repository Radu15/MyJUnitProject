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
        boolean result = x.method3("iadu");
        Assertions.assertTrue(result);
    }


    @Test
    public void method4() {
        MyString invers = new MyString();
        String result = invers.method4("Radu");
        Assertions.assertEquals(result, "udaR");
    }
}