package cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Form.feature", // path to your feature files
        glue = "qa.automation.labs.step.definations", // package containing your step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)
public class ExecutionManager extends AbstractTestNGCucumberTests {
}
