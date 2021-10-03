import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        driver.findElement(By.cssSelector("div.row:nth-child(20) > div:nth-child(1) > p:nth-child(1) > button")).click();

        Alert alert= (Alert)driver.switchTo().alert();

        alert.accept();

        driver.findElement(By.cssSelector("body > div > div:nth-child(22) > div > p:nth-child(1) > button")).click();

        Alert confirm=(Alert)driver.switchTo().alert();

        confirm.dismiss();

        driver.close();
    }
}
