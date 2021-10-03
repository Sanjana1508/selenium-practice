package com.qa.keyword.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public WebDriver driver;
    public Properties prop;

    public WebDriver init_driver(String browser){
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
            if(prop.getProperty("headless").equals("yes")){
                ChromeOptions options=new ChromeOptions();
                options.addArguments("--headless");
                driver=new ChromeDriver(options);
            }
            else{
                driver=new ChromeDriver();
            }
        }
        return driver;
    }

    public Properties init_properties() throws IOException {
        prop=new Properties();
        FileInputStream fis=new FileInputStream("src/main/java/com/qa/keyword/config/config.properties");
        prop.load(fis);
        return prop;
    }
}
