package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/Features",
    glue = {"StepDefinitions", "hooks"},
    plugin = {
        "pretty",
        "html:target/CucumberReports/CucumberReport.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    },
    tags = "@dynamic"
)

public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
}