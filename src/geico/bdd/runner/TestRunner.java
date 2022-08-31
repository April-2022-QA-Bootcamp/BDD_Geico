package geico.bdd.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
				 glue = {"geico.bdd.steps","geico.bdd.base"},
				 tags = "@quote",
				 plugin = {"pretty","html:target/Report.html"},
				 monochrome = true,
				 dryRun = false)
public class TestRunner {

}
