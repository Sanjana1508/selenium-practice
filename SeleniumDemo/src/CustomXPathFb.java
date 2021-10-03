import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPathFb {

    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@mail.com");

        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Pass");

        driver.findElement(By.xpath("//button[@name='login']")).click();

        driver.close();
    }
}