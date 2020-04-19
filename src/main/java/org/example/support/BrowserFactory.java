package org.example.support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {


    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }



    public static WebDriver browserInitialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }


    public static void tearDown() {
        System.out.println("Quit the browser !");
        driver.quit();
    }




}
