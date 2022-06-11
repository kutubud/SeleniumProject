package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper {
	public ChromeDriver driver;
	
	@BeforeMethod
	public void login() {
		
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		//load URL
		driver.get("http://leaftaps.com/opentaps");
		//maximize
		driver.manage().window().maximize();
		//implicitely wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	  driver.findElementByCssSelector(".top>input").sendKeys("DemoSalesManager");
	 //Enter password
	 driver.findElementByCssSelector("label[for='password']+input").sendKeys("crmsfa");
	 //Click login button
	 driver.findElementByCssSelector("input[type='submit']").click();
	 //Click CRM/SFA link
	 driver.findElementByLinkText("CRM/SFA").click();  
	  
		
	}
	@AfterMethod
	public void closeDriver() {
		driver.close();
	}

}
