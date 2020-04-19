package org.example;

import org.example.support.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends baseClass {

    @FindBy(how = How.ID, using = "small-searchterms")
    WebElement searchText;

    @FindBy(how = How.CSS, using = "input.button-1.search-box-button")
    WebElement searchButton;



    public void searchWithKeyword(String keyword) {

        searchText.sendKeys(keyword);
        utils.waitForTextElement("Build your own computer");
        utils.selectOnAutoComplete("Build your own computer");

    }
}
