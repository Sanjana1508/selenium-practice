import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import javax.sound.midi.SysexMessage;

public class Assertions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.spicejet.com/");

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"1 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        try {
            Assert.assertNotEquals("Hi", "Hi");
        }
        catch(AssertionError ae){
            ae.printStackTrace();
        }

        Assert.assertNull(null);

        Assert.assertNotNull("hi");

        Assert.assertNotNull(driver.findElement(By.id("divpaxinfo")).getText());

        driver.close();
    }
}
