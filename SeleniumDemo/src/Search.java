import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium");

        WebElement element = driver.findElement(By.name("btnK"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);

        driver.close();
    }
}
