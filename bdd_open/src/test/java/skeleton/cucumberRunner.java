package skeleton;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions (
		plugin = {"pretty", "html:cucumber-reports"}, 
		features= {"src/test/resources/skeleton/DemoWebShopLogin.feature"},
		monochrome= true, dryRun= false, 
		snippets= SnippetType.CAMELCASE)
public class cucumberRunner {

}
