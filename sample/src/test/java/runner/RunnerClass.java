package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Integrass\\eclipse workspace\\sample\\featureFiles\\HRM.feature", glue="stepDefinition") 
public class RunnerClass {
	//combine the feature file and step definition

}
