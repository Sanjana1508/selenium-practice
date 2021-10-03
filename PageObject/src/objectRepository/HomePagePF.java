package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePF {
    WebDriver driver;

    public HomePagePF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(id="srchquery_tbox")
    WebElement search;

    @FindBy(xpath = "//form[@name='newsrchform']/input[@type='submit']")
    WebElement submit;

    public WebElement search(){
        return search;
    }

    public WebElement submit(){
        return submit;
    }
}
