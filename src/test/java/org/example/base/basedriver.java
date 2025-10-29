package org.example.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class basedriver {

    public static WebDriver driver;

    public static void startBrowser() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver(); // Use class variable
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        driver.get("https://opensource-demo.orangehrmlive.com");
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }

    public static  void quite(){
        driver.quit();
    }
}
