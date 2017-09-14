package POM;
import POM.LoginPage;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	private static WebDriver driver = null ;
	
	public static void main(String[] args)
	{  
		   System.setProperty("webdriver.gecko.driver", "D:\\--WORKSPACE--\\vishal_ws\\cucumber\\drivers\\Projects\\geckodriver.exe");
			
		   //LoginPage lp= new LoginPage(driver);
	 
	     driver = new FirefoxDriver();
	     LoginPage lp= new LoginPage(driver);
		 
	 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     driver.get("http://www.store.demoqa.com");
	 
	     lp.ClickAccount();

	     lp.EnterUsername("testuser_1");
	     lp.EnterPassword("123");

         lp.clickLogin();
	     System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	     lp.Quit();
	}

}
