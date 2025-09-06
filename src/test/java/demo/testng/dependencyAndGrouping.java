package demo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyAndGrouping {

    // launchapp --> login --> search --> advanceSearch -->logout

    @Test(groups = {"smoke","regression"})
    public void launchApp(){
        System.out.println("Application is launching");
    }

    @Test(groups = {"smoke","regression"},dependsOnMethods = "launchApp")
    public void login(){
        System.out.println("Login to app");
    }

    @Test( groups = {"regression"},priority = 1,dependsOnMethods = "login")
    public void search(){
        System.out.println("searching");
        Assert.fail("Search functionality is failing");
    }

    @Test(groups = {"regression"},priority = 2, dependsOnMethods = "search")
    public void advSearch(){
        System.out.println("Advance searching working");
    }

    @Test(groups = {"smoke","regression"},priority = 4, dependsOnMethods = "login")
    public void logout(){
        System.out.println("Logout to App");
    }
}
