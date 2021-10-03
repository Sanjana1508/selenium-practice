package test;

import org.testng.Assert;
import org.testng.annotations.*;

public class Demo {

    @Test(groups={"smoke"})
    public void firstTest(){

        System.out.println("hello");
    }

    @BeforeMethod
    public void beforeEvery(){
        System.out.println("Before method of demo class");
    }

    @AfterMethod
    public void afterEvery(){
        System.out.println("After method of demo class");

    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class of demo");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class of demo");
    }

    @Test(dependsOnMethods = {"thirdTest"})
    public void secondTest(){
        System.out.println("Second Test in demo");
//        Assert.assertFalse(true);
    }

    @Parameters({"url","apikey"})
    @Test
    public void thirdTest(String urlName,String api){
        System.out.println("Third test in demo "+urlName+" "+api);
    }

}
