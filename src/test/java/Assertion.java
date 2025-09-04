import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.SkipException;


public class Assertion {
    
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testEquality() {
        String expected = "Hello";
        String actual = "Hello";
        Assert.assertEquals(actual, expected, "Strings are not equal!");
    }
    @Test
    public void testTruth() {
        boolean condition = (5 > 3);
        Assert.assertTrue(condition, "Condition is not true!");
    }
    @Test
    public void testFalsehood() {
        boolean condition = (5 < 3);
        Assert.assertFalse(condition, "Condition is not false!");
    }
    @Test
    public void testNotNull() {
        Object obj = new Object();
        Assert.assertNotNull(obj, "Object is null!");
    }
    @Test
    public void testNull() {
        Object obj = null;
        Assert.assertNull(obj, "Object is not null!");
    }   
    @Test
    public void testSame() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        Assert.assertSame(obj1, obj2, "Objects are not the same!");
    }
    @Test
    public void testNotSame() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Assert.assertNotSame(obj1, obj2, "Objects are the same!");
    }   
    @Test
    public void testFail() {
        Assert.fail("This test is designed to fail!");
    }
    @Test
    public void testSkip() {
        throw new SkipException("Skipping this test!");
    }
    @Test
    public void testSoftAssertions() {
        softAssert.assertEquals("Hello", "hello", "First assertion failed!");
        System.out.println("This will still execute.");
        softAssert.assertTrue(5 > 3, "Second assertion failed!");
        System.out.println("This will also execute.");
        softAssert.assertNotNull(new Object(), "Third assertion failed!");
        System.out.println("This will execute as well.");
        softAssert.assertAll(); // Collates all assertion results
    }

}
