package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Personal\\git\\repository\\MavenProject\\src\\test\\resources\\featureFile\\Signup.feature",glue="StepDefination",
monochrome =true,
tags= "@single or @multiple",
plugin= {"html:src/test/resources/target/report3.html"}
		)

public class TestRunner {
	
	
	
	

}
