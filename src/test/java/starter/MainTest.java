package starter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testTheCow() {
        Assert.assertEquals("The cow says that the unit test works!", Main.HelloCow());
    }
}