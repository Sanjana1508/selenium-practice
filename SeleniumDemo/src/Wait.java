import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        driver.manage().window().maximize();

       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait w=new WebDriverWait(driver,5);



        String[] items={"Cucumber","Carrot","Mango"};
        Wait wait=new Wait();
        wait.addItems(driver,items);

        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

        driver.close();

    }
    public void addItems(WebDriver driver, String[] items){
        int j=0;
        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0;i<products.size();i++){
            String[] name=products.get(i).getText().split(" ");
            String formattedName=name[0].trim();

            List itemsList= Arrays.asList(items);

            if(itemsList.contains(formattedName)){
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']  //button")).get(i).click();
                if(j==items.length)
                    break;
            }
        }
    }
}
