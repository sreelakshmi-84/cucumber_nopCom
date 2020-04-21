package regression;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.baseClass;
import org.example.loginPage;
import org.example.support.WebDriverUtils;
import org.junit.Assert;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class loginFunction extends baseClass {
    loginPage log = new loginPage();


    @Given("^user is on home page$")
    public void userIsOnHomePage() {


    }

    @When("^user click on login$")
    public void userClickOnLogin() {
        log.LoginClick();
    }

    @And("^Enter registered \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterRegisteredAnd(String email, String pwd) throws Throwable {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        log.enterlogindetails(email, pwd);
    }

    @And("^user click on login button$")
    public void userClickOnLoginButton() {
        log.submitLogin();
    }

    @Then("^user must be able to login the web page$")
    public void userMustBeAbleToLoginTheWebPage() {

        Assert.assertTrue(log.isUserLoggedin());
    }

    @And("^user logout from the application$")
    public void userLogoutFromTheApplication() {
        log.clickOnLogout();
    }

    @Then("^user must not login to the web page$")

    public void userMustNotLoginToTheWebPage() throws InterruptedException {
        Assert.assertTrue(log.isErrorDisplayed());
    }


    @And("^Enter invalid username and password$")
    public void enterInvalidUsernameAndPassword(DataTable credentials) {
        List<Map<String, String>> data = credentials.asMaps(String.class, String.class);
        log.enterlogindetails(data.get(0).get("username"), data.get(0).get("password"));
    }
}