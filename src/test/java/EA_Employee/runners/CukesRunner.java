package EA_Employee.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/Features",
        glue = "EA_Employee/step_definitions",
        dryRun = false,
        tags = "@addDelete"


)

public class CukesRunner {

}
