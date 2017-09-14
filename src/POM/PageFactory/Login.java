package POM.PageFactory;
import POM.PageFactory.LoginPage;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
	//private static final String BrowserFactory = null;
	private static WebDriver driver ;
	
	public static void main(String[] args)
	{  
		  System.setProperty("webdriver.gecko.driver", "D:\\--WORKSPACE--\\vishal_ws\\cucumber\\drivers\\Projects\\geckodriver.exe");
		  // driver=BrowserFactory.startBrowser("firefox", "http://www.store.demoqa.com");
	 
	     driver = new FirefoxDriver();
	     driver.get("http://www.store.demoqa.com");
	     LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		 
	 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     //driver.get("http://www.store.demoqa.com");
	 
	     lp.ClickAccount();

	     lp.EnterUsername("testuser_1");
	     lp.EnterPassword("123");

         lp.clickLogin();
	     System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	     lp.Quit();
	}

}
