package regression;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.HomePage;

import java.util.List;
import java.util.Map;

    public class search {

        HomePage homePage = new HomePage();
        @Given("^I am on landing page$")
        public void i_am_on_landing_page() throws Throwable {

        }


        @When("^I search with keyword$")
        public void iSearchWithKeyword(List<Map<String, String>> keywords) {
            System.out.println(keywords.get(0).get("keyword"));
            homePage.searchWithKeyword(keywords.get(0).get("keyword"));
        }

        @Then("^I should see atleast one search$")
        public void iShouldSeeAtleastOneSearch() {
        }


    }

