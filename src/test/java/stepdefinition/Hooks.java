package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SeleniumUtills;

public class Hooks {

	@Before
	 public void persetUp(){
		SeleniumUtills su= new SeleniumUtills(); 
	}
	
	@After
	 public void teardown(){
		SeleniumUtills.teardown();
	}
}
