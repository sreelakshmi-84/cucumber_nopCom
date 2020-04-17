package org.example;

import cucumber.api.java.cs.A;
import gherkin.deps.com.google.gson.internal.$Gson$Preconditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage{

    BaseClass basic = new BaseClass();

    public void loginTonop(WebDriver driver){

      basic.goingtoWebsite(driver, "https://demo.nopcommerce.com");


    }
    public void loginlink(WebDriver driver){
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
    }
    public void verifySigninpage(WebDriver driver){
        String text =driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")).getText();

        Assert.assertEquals(text,"Welcome, Please Sign In!");
        System.out.println("You are in "+text);

    }

    public void enterlogindetails(WebDriver driver, String email, String pWord){
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(pWord);

    }
    public void submitLogin(WebDriver driver){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")).click();

    }

   public void checkMyaccounttext(WebDriver driver) throws InterruptedException {
        String text =driver.findElement(By.linkText("My account")).getText();
        Assert.assertEquals(text,"My account");
       System.out.println("You have successfully logged in ");
       Thread.sleep(2000);

   }

   public void errorMessage(WebDriver driver){
        String text =driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")).getText();
        Assert.assertEquals(text,"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
        System.out.println("you cannot login in invalid credentials");
   }

public void logout(WebDriver driver){
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
}




}
