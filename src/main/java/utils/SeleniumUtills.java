package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtills {
	 public static WebDriver driver;
	public SeleniumUtills(){
		 if(driver==null){
			  WebDriverManager.chromedriver().setup();
			   driver= new ChromeDriver();
		 }
	}
		 public static  void launchurl(String url){
			  driver.get(url);
		 
	}
		  public WebDriver getSeleniumUtils(){
			   return driver;
		  }
		  
		   public static void sendkeys(By by,String name){
			    driver.findElement(by).sendKeys(name);
		   }

		   public static void click_button(By by){
			    driver.findElement(by).click();
		   }

		   public static void teardown(){
			   if(driver!=null){
				    driver=null;
			   }
		   }
}
