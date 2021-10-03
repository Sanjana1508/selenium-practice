import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.spicejet.com/");

        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();

        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());

        driver.close();
    }
}
