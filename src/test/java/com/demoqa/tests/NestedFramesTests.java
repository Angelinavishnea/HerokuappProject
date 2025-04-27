package com.demoqa.tests;

import com.demoqa.core.TestBase;
import com.demoqa.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NestedFramesTests extends TestBase {
    @BeforeEach
    public void precondition(){
        new HomePage(driver).selectJNestedFrames();
    }


}
