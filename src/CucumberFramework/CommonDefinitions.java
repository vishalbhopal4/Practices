package CucumberFramework;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonDefinitions {
	
	String driverPath = "D:\\--WORKSPACE--\\Selenium_jars\\geckodriver\\";
	public WebDriver driver = null;
	
	@Before("@Hooks")
	public void start_setup(){
		System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		 driver = new FirefoxDriver();
	}
	
	@After("@Hooks")
	public void stop_setup(){
		 driver.quit();
			driver.close();
	}
	
	
@Given("^enter gmail url$")
	 public void navigateUrl() throws Throwable {
		 
	    driver.navigate().to("https://www.walmart.com/account/login");
	 }

  @When("^enter \"(.*?)\"$")
  
	  public void enter_credentials(String uname) throws Throwable {
	  System.out.println("inside fun");
	  System.out.println(uname);
			 driver.findElement(By.name("email")).sendKeys(uname);
  }
	  
  
/*	 @When("^enter credentials$")
	  public void enter_credentials(DataTable table) throws Throwable {
		
		 System.out.println(table);
		 List<List<String>> data = table.raw();
		 System.out.println(data.get(1).get(1));
		driver.findElement(By.name("email")).sendKeys(data.get(1).get(1));
		
	 }*/

	 @When("^Press submit$")
	 public void press_submit() throws Throwable {
		 driver.findElement(By.name("password")).sendKeys("Change!1");
		 //driver.findElement(By.id("signin-submit-btn")).click();
		 //driver.findElement(By.id("Sign In")).click();
		 System.out.println("Press submit");
	   
	 }

	 @Then("^gmail successfully login$")
	 public void gmail_successfully_login() throws Throwable {
		 System.out.println("gmail successfully login");
		
	 }

	   

}
