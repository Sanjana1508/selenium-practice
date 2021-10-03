import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        String simpleText=driver.findElement(By.className("col-md-12")).getText();
        System.out.println(simpleText);

        driver.findElement(By.linkText("This is a link")).click();

        driver.navigate().back();

        driver.findElement(By.id("fname")).sendKeys("Selenium");

        driver.findElement(By.id("fname")).clear();

        driver.findElement(By.id("idOfButton")).click();

        driver.findElement(By.id("female")).click();

        driver.findElement(By.cssSelector(".Automation")).click();

        Select dropdown=new Select(driver.findElement(By.id("testingDropdown")));
        dropdown.selectByVisibleText("Performance Testing");

        dropdown.selectByValue("Automation");

        dropdown.selectByIndex(3);


        driver.close();
    }
}
