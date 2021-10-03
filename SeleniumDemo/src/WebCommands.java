import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class WebCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url="https://www.google.co.in/";
        driver.get(url);

        String title=driver.getTitle();
        System.out.println("Title : "+title);
        System.out.println("Length of the title : "+title.length());

        String currUrl=driver.getCurrentUrl();
        if(currUrl.equals(url)){
            System.out.println("URL verification success");
        }
        else{
            System.out.println("URL verification failed");
        }

        String pageSource=driver.getPageSource();
        System.out.println("Length of the page Source : "+pageSource.length());

        driver.close();
    }
}
