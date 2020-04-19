package regression;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.example.support.BrowserFactory;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = {"src/test/resources/featurefiles"},
//        glue = {"org/example/steps"},
        tags = {"@search"}
        )
public class Runner {

    @BeforeClass
    public static void startBrowser(){
        BrowserFactory.browserInitialize();
        BrowserFactory.getDriver().get("https://demo.nopcommerce.com");
    }

    @AfterClass
    public static void stop(){
        BrowserFactory.tearDown();
    }


}