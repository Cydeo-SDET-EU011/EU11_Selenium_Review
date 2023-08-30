package officeHour.week3.runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
    },
        features = "src/test/java/officeHour/week3/feature",
        glue = "officeHour/week3/step_definitions",
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {
}


