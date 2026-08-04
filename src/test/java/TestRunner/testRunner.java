package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)

@CucumberOptions(
features="src/test/resources/Features",
glue ={"StepDefinitions","hooks"},
plugin= {"pretty","html:target/CucumberReports/CucumberReport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
tags= "@dynamic"
)

public class testRunner {
 
 
}