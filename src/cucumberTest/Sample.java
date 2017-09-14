package cucumberTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", "D:\\--WORKSPACE--\\vishal_ws\\cucumber\\drivers\\Projects\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();


// maximize the window

driver.manage().window().maximize();

// open application

driver.get("http://jqueryui.com");

// Wait for 5 seconds

Thread.sleep(5000);
//List<WebElement> list = driver.findElements(By.xpath("//*[@id='menu-top']/li[2]/a"));
List<WebElement> list=driver.findElements(By.xpath(".//*[@id='menu-top']/li"));
Iterator<WebElement> it = list.iterator();
while (it.hasNext())
{
	WebElement e= it.next();
	System.out.println(e.getText());
}

	
driver.quit();
driver.close();


}

}
