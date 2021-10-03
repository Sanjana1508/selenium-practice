import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("fromCity")).sendKeys("Mum");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest')]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

       // driver.findElement(By.id("toCity")).click();
       // Thread.sleep(2000);

        driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest')]")).sendKeys("del");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest')]")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest')]")).sendKeys(Keys.ENTER);
    }
}
