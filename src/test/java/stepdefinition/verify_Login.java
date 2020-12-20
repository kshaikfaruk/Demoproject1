package stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.io.Files;
import utils.SeleniumUtills;

public class verify_Login {
	 
	@Given("I want to naviagte facebook {string}")
	public void i_want_to_naviagte_facebook(String url) {
		SeleniumUtills.launchurl(url);
	
	}

	@When("I  enter <username> and <password>")
	public void i_enter_username_and_password(io.cucumber.datatable.DataTable dataTable) throws IOException {
	    List<Map<String, String>> list= dataTable.asMaps();
	    WebElement elem= SeleniumUtills.driver.findElement(By.xpath("//input[@type='text']"));

	    WebElement elem1= SeleniumUtills.driver.findElement(By.xpath("//input[@type='password']"));
	     JavascriptExecutor js= (JavascriptExecutor) SeleniumUtills.driver;
	      js.executeScript("arguments[0].style.border='3px red solid'",elem ); 
	      js.executeScript("arguments[0].style.border='3px red solid'",elem1 ); 
	    SeleniumUtills.sendkeys(By.xpath("//input[@type='text']"), list.get(0).get("username"));
	    
	    SeleniumUtills.sendkeys(By.xpath("//input[@type='password']"), list.get(0).get("password"));
	     WebElement e= SeleniumUtills.driver.findElement(By.xpath("//div[@class='_8iep _8icy _9ahz _9ah-']"));
	     //TakesScreenshot ts= (TakesScreenshot) SeleniumUtills.driver;
	      File f=e.getScreenshotAs(OutputType.FILE);
	      Date d= new Date();
	     int current= d.getDate();
	     String s= new String().valueOf(current);
	    
	      Files.move(f, new File("E:\\Testing\\Demo_version\\src\\test\\resources\\screenshot\\"+s+".jpg"));
	}

	@When("click on Login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		SeleniumUtills.click_button(By.xpath("//button[@name='login']"));
	
		 
	
	}

	@Then("I  verify the homepage")
	public void i_verify_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		 String url="https://www.facebook.com/";
//		 int count=0;	 
//	
//		List<WebElement> webEle= SeleniumUtills.driver.findElements(By.tagName("a"));
//		 for(int i=0;i<webEle.size()-1;i++){
//			count++; 
//			 System.out.println(webEle.get(i).getAttribute("href"));
//		 }
		 
		
		
	}


}
