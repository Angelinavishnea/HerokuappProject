package com.demoqa.tests;

import com.demoqa.core.TestBase;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.windows.AlertWindow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JavaScriptAlerts extends TestBase {

    @BeforeEach
    public void precondition(){
        new HomePage(driver).selectJavaScriptAlerts();
    }

    @Test
    public void clickJSAlert(){
        new AlertWindow(driver).verifyAlert();
    }

}
