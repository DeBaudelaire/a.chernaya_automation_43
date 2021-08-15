import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest extends MainClass {

// аннотации
    @Before
    public void textStartTest() {
        System.out.println("Start test");
    }

    @After
    public void textFinishTest() {
        System.out.println("Finish test");
    }

// тесты
    @Test
    public void testGetLocalNumber() {
        int expected = 14;
        int actual = getLocalNumber();
        Assert.assertTrue("getLocalNumber != 14", actual == expected);
    }

    @Test
    public void testGetClassNumber() {
        int expectedmin = 45;
        int actualnumber = getClassNumber();
        if (actualnumber < expectedmin) {
            Assert.fail("Oh, no! getClassNumber < 45");
        }
    }

    @Test
    public void testGetClassString() {
        if (!getClassString().contains("Hello") && !getClassString().contains("hello")) {
            Assert.fail("String doesn't contains 'Hello' or 'hello'!");
        }
    }
}
