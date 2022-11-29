package luma.us.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "json:target/cucumber.json" }, // plugin types of reports =="cucumber.json"
		features = ".//Features/", // features = features file locations
		glue = { "luma.us.stepdefination", "luma.us.hooks" }, // glue = Step defination package path+ hooks package path
		tags = "@smoke" // tags = run user specifaction test cases

)

public class MyRunner extends AbstractTestNGCucumberTests {

}
