package com.demoqa.pages.windows;

import com.demoqa.core.BaseFunctions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertWindow extends BaseFunctions {
    public AlertWindow(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Click for JS Alert')]")
    WebElement clickJSAlert;

    public AlertWindow verifyAlert() {
        click(clickJSAlert);
        Assertions.assertTrue(isAlertPresent(2));
        return this;
    }
}
