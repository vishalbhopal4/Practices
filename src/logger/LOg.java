package logger;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.*;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LOg {
	public static void main(String[] args)
	{
		// Here we need to create logger instance so we need to pass Class name for 
	     //which  we want to create log file in my case Google is classname
Logger log=Logger.getLogger("LOg");

PropertyConfigurator.configure("D:\\--WORKSPACE--\\vishal_ws\\cucumber\\logs\\log4j.properties");
//Open browser
System.setProperty("webdriver.gecko.driver", "D:\\--WORKSPACE--\\vishal_ws\\cucumber\\drivers\\Projects\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
log.info("Browser Opened");
// Set implicit wait
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
log.info("Implicit wait given");

// Load application
driver.get("https://www.google.co.in/");
log.info("Url opened");
log.debug("Url opened");

// type Selenium
driver.findElement(By.name("q")).sendKeys("Selenium");
log.info("keyword type"); 
driver.quit();
driver.close();
	}

}
