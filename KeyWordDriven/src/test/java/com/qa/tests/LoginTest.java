package com.qa.tests;

import com.qa.keyword.engine.KeyWordEngine;
import org.testng.annotations.Test;

public class LoginTest {

    public KeyWordEngine keyWordEngine;

    @Test
    public void loginTest(){
        keyWordEngine=new KeyWordEngine();
        keyWordEngine.startExecution("login");
    }
}
