package demo.testng;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import org.testng.SkipException;


public class Assertion {
    
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 1)
    public void testEquality() {
        String expected = "Hello";
        String actual = "Hello";
        System.out.println("Asserting equality of two strings.");
        Assert.assertEquals(actual, expected, "Strings are not equal!");
    }
    @Test(priority = 2)
    public void testTruth() {
        boolean condition = (5 > 3);
        System.out.println("Asserting that condition is true.");
        Assert.assertTrue(condition, "Condition is not true!");
    }
    @Test(priority = 3)
    public void testFalsehood() {
        boolean condition = (5 < 3);
        System.out.println("Asserting that condition is false.");
        Assert.assertFalse(condition, "Condition is not false!");
    }
    @Test(priority = 4)
    public void testNotNull() {
        Object obj = new Object();
        System.out.println("Asserting that object is not null.");
        Assert.assertNotNull(obj, "Object is null!");
    }
    @Test(priority = 5)
    public void testNull() {
        Object obj = null;
        System.out.println("Asserting that object is null.");
        Assert.assertNull(obj, "Object is not null!");
    }   
    @Test(priority = 6)
    public void testSame() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        System.out.println("Asserting that both objects are the same.");
        Assert.assertSame(obj1, obj2, "Objects are not the same!");
    }
    @Test(priority = 7)
    public void testNotSame() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("Asserting that both objects are not the same.");
        Assert.assertNotSame(obj1, obj2, "Objects are the same!");
    }   
    @Test(priority = 8)
    public void testFail() {
        try {
        Assert.fail("This test is designed to fail!");
    } catch (AssertionError e) {
        System.out.println("Test failed with message: " + e.getMessage());
        throw e; // re-throw so TestNG still marks it as failed
    }
    }
    @Test(priority = 9)
    public void testSkip() {
        System.out.println("Skipping this test intentionally.");
        throw new SkipException("Skipping this test!");
    }
    @Test(priority = 10)
    public void testSoftAssertions() {
        softAssert.assertEquals("Hello", "hello", "First assertion failed!");
        System.out.println("This will still execute.");
        softAssert.assertTrue(5 > 3, "Second assertion failed!");
        softAssert.assertNotNull(new Object(), "Third assertion failed!");
        softAssert.assertAll(); // Collates all assertion results
    }

}
