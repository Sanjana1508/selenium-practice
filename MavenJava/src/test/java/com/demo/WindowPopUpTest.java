package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/home/sanjp/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://admin:admin@the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Basic Auth")).click();
    }
}
