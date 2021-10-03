import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitTest{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.cssSelector("div#start > button")).click();

        Wait wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
                            .pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

        WebElement ele= (WebElement) wait.until(new Function<WebDriver,WebElement>(){
                public WebElement apply(WebDriver driver){
                    WebElement ele= driver.findElement(By.cssSelector("div#finish > h4"));
                    if(ele.isDisplayed()){
                        return ele;
                    }
                    return null;
                }
        });
        System.out.println(driver.findElement(By.cssSelector("div#finish > h4")).getText());

        driver.close();
    }
}
