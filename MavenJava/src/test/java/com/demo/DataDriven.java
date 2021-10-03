package com.demo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class DataDriven {
    public Object[][] getData(String testcase) throws IOException {
        FileInputStream fis=new FileInputStream("/home/sanjp/Documents/demoData.xlsx");
        XSSFWorkbook workbook =new XSSFWorkbook(fis);

        ArrayList<String> arr=new ArrayList<>();
        Object[][] data=new Object[4][];

        int sheets=workbook.getNumberOfSheets();
        for(int i=0;i<sheets;i++){
            if(workbook.getSheetName(i).equalsIgnoreCase("TestData")) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                Iterator<Row> rows=sheet.iterator();
               data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
                Row firstRow= rows.next();
                Iterator<Cell> cells=firstRow.cellIterator();
                int column=-1;
                int k=0;
                while(cells.hasNext()){
                    Cell value=cells.next();
                    if(value.getStringCellValue().equalsIgnoreCase("Testcases")){
                        column=k;
                    }
                    k++;
                }
                System.out.println(column);
                while(rows.hasNext()){
                    Row r=rows.next();
                    if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcase)){
                        Iterator<Cell> c=r.cellIterator();
                        while(c.hasNext()){
                            Cell ce=c.next();
                            if(ce.getCellType()== CellType.STRING) {
                                arr.add(ce.getStringCellValue());
                            }
                            else{
                                arr.add(NumberToTextConverter.toText(ce.getNumericCellValue()));
                            }
                        }
                    }
                }
                for(int r=0;r<sheet.getLastRowNum();r++){
                    for(int c=0;c<sheet.getRow(r).getLastCellNum();c++){
                        data[r][c]=sheet.getRow(r+1).getCell(c).toString();
                    }
                }
            }
        }
        return data;
    }
}
