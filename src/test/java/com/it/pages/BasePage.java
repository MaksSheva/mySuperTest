package com.it.pages;

import com.it.griver.MyDriverScroll;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected static MyDriverScroll driver = MyDriverScroll.getDriver();

    public BasePage() {

        PageFactory.initElements(driver, this);
    }



}
