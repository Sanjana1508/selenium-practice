import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://duckduckgo.com/");

        driver.findElement(By.id("search_form_input_homepage")).sendKeys("animals");

        driver.findElement(By.cssSelector("input#search_button_homepage")).click();

        driver.findElement(By.cssSelector("div a"));

        driver.findElement(By.cssSelector("div > a"));

        driver.findElement(By.cssSelector("div[class*='header']"));

        driver.findElement(By.cssSelector("li:not(.zcm__item)"));

        driver.findElement(By.cssSelector("li[class='zcm__item']:nth-child(3)"));

        driver.findElement(By.cssSelector("div.header__search-wrap  div.search__autocomplete "));

        driver.close();
    }
}
