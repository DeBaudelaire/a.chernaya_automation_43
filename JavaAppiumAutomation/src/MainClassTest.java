import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
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
}


