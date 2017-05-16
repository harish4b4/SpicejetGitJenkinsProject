package cucumberRunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "features/Spicejet.feature",format = {"pretty","html:target/cucum","json:target/cucumber.json"})
public class SpicejetRunnerTest {

}
