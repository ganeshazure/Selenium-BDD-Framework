package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"StepDefinitions", "hooks"},
    plugin = {
        "pretty",
        "html:target/CucumberReports/CucumberReport.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    },
    tags = "@reg_new"
)

public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
}