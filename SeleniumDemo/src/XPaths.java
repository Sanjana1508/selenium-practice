import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPaths {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://duckduckgo.com/");

        driver.findElement(By.id("search_form_input_homepage")).sendKeys("animals");

        driver.findElement(By.xpath("//input[@id='search_button_homepage']")).click();

        driver.findElement(By.xpath("//a[contains(@class ,'zcm__link')]"));

        driver.findElement(By.xpath("//div[contains(@class,'result__snippet')][contains(.,'wild')]"));

        driver.findElement(By.xpath("//div[contains(@class,'result__snippet')][not(contains(text(),'wild'))]"));

        driver.findElement(By.xpath("(//div[contains(@class,'result__snippet')])[6]"));

        driver.findElement(By.xpath("//a[.//img]"));

        driver.findElement(By.xpath("//a[contains(@class ,'zcm__link')][preceding::a[@data-zci-link='web']]"));

        driver.findElement(By.xpath("//a[contains(@class ,'zcm__link')][following::a[@data-zci-link='videos']]"));

        driver.findElement(By.xpath("//a[contains(@class ,'footer__card')][contains(@data-id,'hiring')]"));

        driver.findElement(By.xpath("//a[contains(@class ,'footer__card') and contains(@data-id,'hiring')]"));

        driver.findElement(By.xpath("//input[@id='search_form_input' or contains(@name,'q')]"));

        driver.findElement(By.xpath("//ul[starts-with(@class,'zcm')]"));

        driver.findElement(By.xpath("//div[not(contains(@class,'result'))]"));

        driver.findElement(By.xpath("//ul[not(starts-with(@class,'zcm'))]"));

        driver.findElement(By.xpath("//a[.='Text']")); //By.linkText("Text")

        driver.findElement(By.xpath("//a[contains(.,'PartialText')]"));//By.partialLinkText("PartialText")

        driver.findElement(By.xpath("//a")); // By.TagName("a")

        driver.close();

    }
}
