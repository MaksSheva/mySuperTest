package com.it.tests;

import com.it.App;
import com.it.Utils.User;
import com.it.Utils.UserFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected static App app = new App();
    protected static User validUser = UserFactory.getValidUser();

    @BeforeSuite
    public void setUp() {
        app.common.open();
    }

    @AfterSuite
    public void tearDown() {
        app.common.close();
    }
}
