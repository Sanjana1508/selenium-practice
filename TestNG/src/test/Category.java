package test;

import org.testng.annotations.*;

public class Category {

    @Test(groups={"smoke"})
    public void catFirstTest(){
        System.out.println("First Test in Category");
    }

    @Test(enabled=false)
    public void catSecondTest(){
        System.out.println("Second Test in Category");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Data cleaning");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Close drivers");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @Parameters({"url"})
    @Test(timeOut = 2000)
    public void catThirdTest(String urlName){
        System.out.println("Third Test in Category "+urlName);
    }

    @Test(dataProvider = "getData")
    public void catFourthTest(String username,String pass){
        System.out.println("Fourth Test in Category "+username+" "+pass);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data=new Object[2][2];
        data[0][0]="username1";
        data[0][1]="pass1";
        data[1][0]="username2";
        data[1][1]="pass2";
        return data;
    }
}
