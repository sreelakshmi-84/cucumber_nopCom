package regression;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.LoginPage;
import org.example.baseClass;
import org.example.RegistrationPage;
import org.openqa.selenium.WebDriver;


public class RegisterToCommerce extends baseClass {

    RegistrationPage reg = new RegistrationPage();
    LoginPage loginPage = new LoginPage();



    @Given("^Customer is on nopCommerce website$")
    public void customer_is_on_nopCommerce_website()  {

        reg.registraion();
        // Write code here that turns the throw new PendingException();
    }


    @When("^Customer Clicks on registration link$")
    public void customer_Clicks_on_registration_link()  {
        // Write code here that turns the phrase above into concrete actions
        reg.clickOnRegistraionlink();
    }

    @Then("^Registration form should be shown with text fileds to enter$")
    public void registration_form_should_be_shown_with_text_fileds_to_enter()  {

       reg.checkForRegistrationText();
    }

    @When("^Customer enters valid details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void customer_enters_valid_details_and(String firstName, String lastName, String email, String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);

        reg.enterDetails(firstName,lastName,email,password);



    }

    @When("^clicks on Submit$")
    public void clicks_on_Submit()  {
        // Write code here that turns the phrase above into concrete actions
        reg.clickOnSubmit();

    }

    @Then("^Customer should receive successdull message$")
    public void customer_should_receive_successdull_message()  {

        reg.successfulMessage();
        loginPage.logout();
        // Write code here that turns the phrase above into concrete actions

    }





}
