package testcases;

import objectRepository.HomePage;
import objectRepository.HomePagePF;
import objectRepository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

    @Test
    public  void login() {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        LoginPage login=new LoginPage(driver);

        login.username().sendKeys("test");
        login.password().sendKeys("pass");
        login.submit().click();
        login.home().click();

        HomePagePF home=new HomePagePF(driver);

        home.search().sendKeys("rediff");
        home.submit().click();

        driver.close();
    }
}
