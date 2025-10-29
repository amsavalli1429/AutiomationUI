package org.example.utill;

import org.example.base.basedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class commonActions extends basedriver {

    public static void enterText(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }



    public static void clickmethod(By locator) {
        driver.findElement(locator).click();
    }

    // Check element states
    public boolean isSelected(By locator) {
        return driver.findElement(locator).isSelected();
    }

    public boolean isEnabled(By locator) {
        return driver.findElement(locator).isEnabled();
    }

    public boolean isDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }
}
