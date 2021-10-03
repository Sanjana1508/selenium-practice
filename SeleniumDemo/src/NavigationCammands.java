import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCammands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        driver.findElement(By.linkText("This is a link")).click();

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        driver.navigate().refresh();

        driver.close();
    }
}
