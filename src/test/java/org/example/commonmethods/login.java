package org.example.commonmethods;

import org.example.base.basedriver;
import org.example.locators.locatorsUI;
import org.example.utill.commonActions;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.example.locators.locatorsUI.*;


public class login extends basedriver {

    commonActions loginPage;

    @BeforeClass
    public void setup() {
        startBrowser();           // Start browser from basedriver
        loginPage = new commonActions();       // Initialize common methods

    }
    @Test

    public void userlogin(){

        loginPage.enterText(By.xpath(USERNAME_XPATH), "Admin");
        loginPage.enterText(By.xpath(PASSWORD_XPATH), "admin123");
        loginPage.clickmethod(By.xpath(LOGIN_BUTTON_XPATH));


    }


}
