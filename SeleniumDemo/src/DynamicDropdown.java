import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DynamicDropdown {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.spicejet.com/");

        driver.manage().window().maximize();

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(2000);

      //  driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("a.ui-state-highlight")).click();

        driver.findElement(By.id("divpaxinfo")).click();

        WebElement passengers=driver.findElement(By.cssSelector("select[id*='Adult']"));

        Select dropdown=new Select(passengers);

        dropdown.selectByValue("3");

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"3 Adult");

        Assert.assertFalse(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));

        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.close();

    }
}
