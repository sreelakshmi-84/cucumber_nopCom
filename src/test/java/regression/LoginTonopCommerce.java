package regression;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.baseClass;
import org.example.LoginPage;

public class LoginTonopCommerce extends baseClass {


    LoginPage lpage = new LoginPage();
    ///WebDriver driver = BrowserFactory.browserInitialize();

    @Given("^I am on landing page$")
    public void i_am_on_landing_page() throws InterruptedException {

    }

    @When("^I click on Login icon from landing page$")
    public void i_click_on_Login_icon_from_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        lpage.gotoLoginPage();

    }

    @Then("^I should be navigated to loginpage$")
    public void i_should_be_navigated_to_loginpage() throws InterruptedException {
        lpage.verifySigninpage();
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(2000);

    }

    @When("^I enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_email_and_password(String email, String pwd)  {

        // Write code here that turns the phrase above into concrete actions
        lpage.enterlogindetails( email ,pwd);

    }

    @When("^Click on login button$")
    public void click_on_login_button() throws InterruptedException {
        lpage.submitLogin();
    }

    @Then("^I should be successfully logged in and see my account$")
    public void i_should_be_successfully_logged_in_and_see_my_account() throws InterruptedException {
        lpage.checkMyaccounttext();
        lpage.logout();

        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should get error message$")
    public void i_should_get_error_message()  {
    lpage.errorMessage();

        // Write code here that turns the phrase above into concrete actions

    }


}
