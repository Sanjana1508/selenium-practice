package com.demo;

import java.io.IOException;

public class DataDrivenTest {
    public static  void main(String[] args) throws IOException {
        DataDriven dd=new DataDriven();
        Object[][] data=dd.getData("Add Profile");
        for(Object[] s:data){
            for(int i=0;i<s.length;i++)
                System.out.println(s[i]);
        }
    }
}
