package demo.testng;
import org.testng.annotations.*;

public class testngAnnotation {
    
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite: Setting up test suite environment.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite: Tearing down test suite environment.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test: Preparing for test execution.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test: Cleaning up after test execution.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class: Initializing resources for the test class.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class: Releasing resources for the test class.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method: Setting up preconditions for the test method.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method: Cleaning up postconditions for the test method.");
    }

    @Test
    public void testMethod1() {
        System.out.println("Executing Test Method 1");
        // Test logic here
    }

    @Test
    public void testMethod2() {
        System.out.println("Executing Test Method 2");
        // Test logic here
    }
}
