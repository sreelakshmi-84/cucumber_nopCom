package org.example;

import org.example.support.BrowserFactory;
import org.example.support.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseClass {


    public WebDriver driver;

    public baseClass(){
        driver = BrowserFactory.getDriver();
        PageFactory.initElements(driver,this);
    }

    WebDriverUtils utils = new WebDriverUtils();


    public static void waitForElement( WebElement element) {

//        System.out.println(">>>>> Waiting for WebElement");
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//        System.out.println("<<<<< End of Waiting for WebElement");
    }

    public static void waitTillElementFound(WebDriver driver, WebElement ElementTobeFound, int seconds) {
//        WebDriverWait wait = new WebDriverWait(driver, seconds);
//        wait.until(ExpectedConditions.visibilityOf(ElementTobeFound));
    }

    public void goingtoWebsite(WebDriver driver, String url) {
        driver.get(url);
    }

}
