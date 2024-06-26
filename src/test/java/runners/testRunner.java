package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"src/test/java/steps"},
        plugin = {"json:target/cucumber.json", "pretty"}
)
public class testRunner extends AbstractTestNGCucumberTests {
}
