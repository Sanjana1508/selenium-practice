import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("file:///home/sanjp/IdeaProjects/SeleniumDemo/src/html/radiobutton.html");

        driver.findElement(By.xpath("//input[@value='Java']")).click();

        int size=driver.findElements(By.xpath("//input[@name='group2']")).size();

        driver.findElements(By.xpath("//input[@name='group2']")).get(size-1).click();

        driver.close();
    }
}
