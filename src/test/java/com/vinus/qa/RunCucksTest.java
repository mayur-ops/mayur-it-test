package com.vinus.qa;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", tags = {"@search"} , strict = true, plugin = {"json:target/cucumber.json"})
public class RunCucksTest {

}
