import java.util.Scanner;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class Math_Test {
    Math math;
    @Before
    public void setUp() throws Exception {
        math = new Math(10, 7);
    }
    @Test
    public void testAdd() {
        Assert.assertEquals(17, math.add());
    }
    @Test
    public void testSub() {
        Assert.assertEquals(3, math.sub());
    } 
}