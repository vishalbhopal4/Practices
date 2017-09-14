package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public static WebDriver driver;

	
	//locators
	By account =By.id("account");
	By uname= By.id("log");
	By password= By.id("pwd");
	By login =By.id("login");
	
	//Methods
	
	public  LoginPage(WebDriver driver)
	{
		LoginPage.driver=driver;
	}
	
	public void ClickAccount()
	{
		driver.findElement(account).click();
	}
	
	public  void EnterUsername(String uid)
	{
		driver.findElement(uname).sendKeys(uid);
	}
	public void EnterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickLogin()
	{
		 driver.findElement(login).click();
	}
	public void Quit()
	{
	driver.quit();
    //driver.close();
	}
}
