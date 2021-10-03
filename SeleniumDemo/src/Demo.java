import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://www.javatpoint.com/");

        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("scrollBy(0,5000)");

        driver.findElement(By.cssSelector("#city > table > tbody > tr > td > fieldset:nth-child(28) > div > a:nth-child(12) > div")).click();

        driver.close();
    }
}
