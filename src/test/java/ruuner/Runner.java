package ruuner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="E:\\Testing\\Demo_version\\src\\test\\resources\\features\\Login.feature",glue="stepdefinition",
 plugin={"html:target/cucumber.html"}
		 )
public class Runner extends AbstractTestNGCucumberTests  {

}