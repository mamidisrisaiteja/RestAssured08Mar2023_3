package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\mamid\\eclipse-workspace\\RestAssured08Mar2023\\src\\test\\java\\features\\getOrder.feature",glue= {"stepdefinition"},plugin={"html:target/destination/index.html"},tags="@test1")
	public class GetRunner {

	}


