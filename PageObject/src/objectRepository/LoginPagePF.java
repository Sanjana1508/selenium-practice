package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

    WebDriver driver;

    public LoginPagePF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath="//input[@id='login1']")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(name="proceed")
    WebElement signIn;

    @FindBy(linkText="rediff.com")
    WebElement home;

    public WebElement username(){
        return username;
    }

    public WebElement password(){
        return password;
    }

    public WebElement submit(){
        return signIn;
    }

    public WebElement home(){
        return home;
    }
}
