package com.demoqa.pages;

import com.demoqa.core.BaseFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseFunctions {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /// //////////////////////////////////////////////////////////////
    @FindBy(xpath = "//a[contains(text(),'JavaScript Alerts')]")
    WebElement javaScriptAlertWindow;

    public void selectJavaScriptAlerts() {  //for precondition
        clickWithJS(javaScriptAlertWindow, 0, 300);
    }

/// ///////////////////////////////////////////////////////////////////
    @FindBy(xpath = "//a[contains(text(),'Nested Frames')]")
    WebElement nestedFramesWindow;

    public void selectJNestedFrames() {  //for precondition
        clickWithJS(nestedFramesWindow, 0, 300);
    }
}
