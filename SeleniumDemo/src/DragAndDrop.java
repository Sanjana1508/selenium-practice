import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        WebElement from = driver.findElement(By.id("sourceImage"));

        WebElement to=driver.findElement(By.id("targetDiv"));

        Actions act=new Actions(driver);

        act.dragAndDrop(from,to).build().perform();

        driver.close();

    }
}
