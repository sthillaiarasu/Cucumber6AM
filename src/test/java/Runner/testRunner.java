package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Features", glue = "main", 
monochrome = true,dryRun = false, plugin = {"html:target/rep.html","json:target/report.json",
		"junit:target/repo.xml"},tags = "@run")
public class testRunner {

}
