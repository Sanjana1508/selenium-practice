package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    By search=By.id("srchquery_tbox");
    By submit=By.xpath("//form[@name='newsrchform']/input[@type='submit']");

    public WebElement search(){
        return driver.findElement(search);
    }

    public WebElement submit(){
        return driver.findElement(submit);
    }
}
