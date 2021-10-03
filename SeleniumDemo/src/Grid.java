import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grid {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://techcanvass.com/examples/webtable.html");

        System.out.println(driver.findElement(By.xpath("//table[@id='t01']/tbody/tr[1]/th[1]")).getText());

        System.out.println(driver.findElement(By.xpath("//table[@id='t01']/tbody/tr[3]/td[3]")).getText());

        WebElement table=driver.findElement(By.xpath("//table/tbody"));
        int rows=table.findElements(By.tagName("tr")).size();
        int cols=table.findElements(By.tagName("th")).size();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1){
                    System.out.println(table.findElement(By.xpath("//tr["+i+"]/th["+j+"]")).getText());
                }
                else{
                    System.out.println(table.findElement(By.xpath("//tr["+i+"]/td["+j+"]")).getText());
                }
            }
        }
        driver.close();
    }
}
