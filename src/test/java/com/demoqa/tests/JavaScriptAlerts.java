package com.demoqa.tests;

import com.demoqa.core.TestBase;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.windows.AlertWindow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JavaScriptAlerts extends TestBase {

    AlertWindow alerts;

    @BeforeEach
    public void precondition() {
        alerts = new AlertWindow(driver);
        new HomePage(driver).selectJavaScriptAlerts();
    }

    @Test
    @DisplayName("Click for JS Alert and click OK.")
    public void clickJSAlert() {
        alerts.startAlertAndClickResult("OK")
                .verifyResult("You successfully clicked an alert");
    }

    @Test
    @DisplayName("Click for JS Confirm")
    public void clickJSConfirm() {
        alerts.startAlertAndClickResult2("Cancel")
                .verifyResult("Cancel");
    }

    @Test
    @DisplayName("Click for JS Prompt")
    public void clickJSPrompt() {
        alerts.sendMessageToAlert("Hallo World!")
                .verifyResult("Hallo World!");
    }
}
