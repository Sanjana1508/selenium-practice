import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssFb {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.fb.com");

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("test@mail.com");

//        driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("pass");

        driver.findElement(By.cssSelector("input#pass")).sendKeys("pass");

//        driver.findElement(By.cssSelector("a[href*='recover']")).click();

        driver.findElement(By.cssSelector("[name='login']")).click();

        driver.close();
    }
}
