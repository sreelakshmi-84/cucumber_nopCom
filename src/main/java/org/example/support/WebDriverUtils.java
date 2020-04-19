package org.example.support;

import org.example.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtils extends baseClass {


    public boolean verifyTextPresentOnPage(String text){
        return driver.findElement(By.tagName("body")).getText().contains(text);
    }

    public boolean isLinkWithTextPresent(String text) {
        return driver.findElements(By.linkText(text)).size()>0;
    }

    public void waitForTextElement(String text) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
      //  webDriverWait.until(ExpectedConditions.visibilityOf(By.xpath("//span[text()='"+text+"']")));

    }

    public void selectOnAutoComplete(String text) {
        driver.findElement(By.xpath("//span[text()='"+text+"']")).click();
    }
}
