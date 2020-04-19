package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Random;

public class RegistrationPage extends baseClass {


    public void registraion() {

        driver.get("https://demo.nopcommerce.com/");

    }

    public void clickOnRegistraionlink() {
        driver.findElement(By.linkText("Register")).click();

    }

    public void checkForRegistrationText() {

        String text = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")).getText();
        Assert.assertEquals("Register", text);
        System.out.println("you are in " + text + "Page");
    }

    public void enterDetails(String fName, String lName, String email, String pWord) {
        //waitTillElementFound(driver,driver.findElement(By.id("FirstName")),5);
        int newRandomNum = randomNumber(10001, 99999);
        driver.findElement(By.id("FirstName")).sendKeys(fName);
        driver.findElement(By.id("LastName")).sendKeys(lName);
        System.out.println("Newly madeup email_id is: " + newRandomNum + email);
        driver.findElement(By.id("Email")).sendKeys(newRandomNum + email);
        driver.findElement(By.id("Password")).sendKeys(pWord);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(pWord);


    }

    public int randomNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public void clickOnSubmit() {
        driver.findElement(By.id("register-button")).click();
    }

    public void successfulMessage() {
        String text = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]")).getText();
        Assert.assertEquals("Your registration completed", text);
        System.out.println("you have Registered Successfully");
    }


}
