package POM.PageFactory;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	public static WebDriver driver;

	
	//locators
	//By uname= By.id("log");
	@FindBy(id="log") 
	@CacheLookup
	WebElement username; 
	 
	@FindBy(how=How.ID,id="pwd")
	@CacheLookup
	WebElement password;
	 
	@FindBy(how=How.ID,id="login")
	@CacheLookup
	WebElement login;
	 
	@FindBy(how=How.ID,id="account")
	@CacheLookup
	WebElement account;

	
	//Methods
	
	public  LoginPage(WebDriver driver)
	{
		LoginPage.driver=driver;
	}
	
	public void ClickAccount()
	{
		account.click();
	}
	
	public  void EnterUsername(String uid)
	{
		username.sendKeys(uid);
	}
	public void EnterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickLogin()
	{
		 login.click();
	}
	public void Quit()
	{
	driver.quit();
    //driver.close();
	}
}
