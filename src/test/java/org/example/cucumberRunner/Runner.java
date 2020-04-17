package org.example.cucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/featurefiles"},
        glue = {"org/example/steps"},
        tags = {"@register"})

public class Runner {

}