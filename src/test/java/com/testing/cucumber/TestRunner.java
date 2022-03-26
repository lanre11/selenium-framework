package com.testing.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature",
        glue = {"com.testing.stepDefinition",
                "com.testing.cucumber",},
        plugin = {"pretty","html:target/site/cucumber.html"},
        tags = "@CreateAccount"
)
        public class TestRunner {
        
}
