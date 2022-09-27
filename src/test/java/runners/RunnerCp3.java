package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/CP3.feature",
        tags = "@CP3",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerCp3 {
}
