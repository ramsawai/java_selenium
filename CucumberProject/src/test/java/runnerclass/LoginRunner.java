package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:login/login.feature"}
		,glue= {"stepdefination"}
		)
public class LoginRunner {

}

