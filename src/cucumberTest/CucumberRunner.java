package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
	format = {"pretty","html:reports/test-report"},
		//format1 ={"pretty" , "html:target/"},
		//format = {"pretty", "html:target/html/"},
    features = {"src/cucumberFeatures/"}
	//tags used to categorize test suites / ','-> and / 'or','||' -> 
	//tags = {"@Feature1"} 
)

public class CucumberRunner {

}
