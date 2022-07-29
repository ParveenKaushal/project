package runner;


import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Users\\kaush\\eclipse-workspace\\MavenCucumber\\src\\test\\java\\feature"},
		glue= {"stepdefinition"}
		)
public class ScotiaTest {
	
}
