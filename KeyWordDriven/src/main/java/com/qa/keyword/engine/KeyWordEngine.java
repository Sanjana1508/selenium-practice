package com.qa.keyword.engine;

import com.qa.keyword.base.Base;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class KeyWordEngine {
    public WebDriver driver;
    public Properties prop;

    public Workbook book;
    public Sheet sheet;

    public Base base;

    public  WebElement element;

    public final String SCENARIO_SHEET_PATH="src/main/java/com/qa/keyword/scenarios/hubspot_scenarios.xls";

    public void startExecution(String sheetName){

        String locatorName=null;
        String locatorValue=null;

        FileInputStream fis=null;
        try{
            fis=new FileInputStream(SCENARIO_SHEET_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try{
            book= WorkbookFactory.create(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        sheet=book.getSheet(sheetName);
        int k=0;
        for(int i=0;i<sheet.getLastRowNum();i++) {
            try {
                String locator = sheet.getRow(i + 1).getCell(k + 1).toString().trim();
                if (!locator.equalsIgnoreCase("NA")) {
                    locatorName = locator.split("=")[0].trim();
                    locatorValue = locator.split("=")[1];
                }
                String action = sheet.getRow(i + 1).getCell(k + 2).toString().trim();
                String value = sheet.getRow(i + 1).getCell(k + 3).toString().trim();
                switch (action) {
                    case "open browser":
                        base = new Base();
                        try {
                            prop = base.init_properties();
                            if (value.equals("NA") || value.isEmpty()) {
                                driver = base.init_driver(prop.getProperty("browser"));
                            } else {
                                driver = base.init_driver(value);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "enter url":
                        if (value.equals("NA") || value.isEmpty()) {
                            driver.get(prop.getProperty("url"));
                        } else {
                            driver.get(value);
                        }
                        break;
                    case "quit":
                        driver.quit();
                        break;
                    default:
                        break;
                }

                switch (locatorName) {
                    case "id":
                        element = driver.findElement(By.id(locatorValue));
                        if (action.equalsIgnoreCase("sendkeys")) {
                            element.clear();
                            element.sendKeys(value);
                        } else if (action.equalsIgnoreCase("click")) {
                            element.click();
                        }
                        locatorName = null;
                        break;
                    case "linkText":
                        element = driver.findElement(By.linkText(locatorValue));
                        element.click();
                        locatorName = null;
                        break;
                    default:
                        break;
                }
            }
            catch(Exception e){
               System.out.println("locator is null");
            }
        }
    }
}
