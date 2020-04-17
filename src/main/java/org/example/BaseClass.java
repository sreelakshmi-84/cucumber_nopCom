package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    public WebDriver browserInitialize() {
        System.out.println("Initialise the browser !");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_mac");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public void tearDown(WebDriver driver) {
        System.out.println("Quit the browser !");
        driver.quit();
    }

    public static void waitForElement(WebDriver driver, WebElement element) {

        System.out.println(">>>>> Waiting for WebElement");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        System.out.println("<<<<< End of Waiting for WebElement");
    }

    public static void waitTillElementFound(WebDriver driver, WebElement ElementTobeFound, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(ElementTobeFound));
    }

    public void goingtoWebsite(WebDriver driver, String url) {
        driver.get(url);
    }

}
