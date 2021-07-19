package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"}, 
		glue = {"steps"},
		plugin = {"pretty", "html:Report/report.html"},
//		dryRun = true, //just to run features alone to find whether any step is not having step definition
//		strict = true,
		monochrome = true
//		tags = "",
//		name = {""} //it will pick the scenarios which contain this keywords
		)
public class TestRunner {

}
