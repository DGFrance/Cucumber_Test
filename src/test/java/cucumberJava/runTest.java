package cucumberJava;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber"},
        features = {"src/test/java/feature/cucumberJava.feature"}
        )
public class runTest {
//Do something
}
