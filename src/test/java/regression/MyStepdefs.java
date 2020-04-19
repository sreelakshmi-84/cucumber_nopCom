package regression;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.HomePage;

import java.util.List;
import java.util.Map;

public class MyStepdefs {

    HomePage homePage = new HomePage();

    @When("^I search with keyword$")
    public void iSearchWithKeyword(List<Map<String, String>> keywords) {
        System.out.println(keywords.get(0).get("keyword"));
        homePage.searchWithKeyword(keywords.get(0).get("keyword"));
    }

    @Then("^I should see atleast one search$")
    public void iShouldSeeAtleastOneSearch() {
    }


}
