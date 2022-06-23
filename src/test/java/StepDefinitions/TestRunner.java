package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features/StartAMonitoring.feature",
	glue={"StepDefinitions"},
	monochrome = true,
	dryRun=true,
	plugin={"pretty","html:target/HTMLReports/index.html"}
)
public class TestRunner {
}

 