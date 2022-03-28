package bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        glue = "bdd.glue",
        features = "src/test/resources/features",
        stepNotifications = true,
        tags = "@SEARCH_LINIO",
        plugin={"html:src/test/resources/CucumberReports/HTMLReports/reportTypeHTML.html"
        }
)
public class RunnerTest {

}
