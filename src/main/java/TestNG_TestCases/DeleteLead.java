package TestNG_TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {

	//public static void main(String[] args) {
		
	@Test
	public void deleteLead() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			
		 	driver.manage().window().maximize();
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			//driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
		    // click Find lead link
		    driver.findElementByLinkText("Find Leads").click();
		    // click on phone
		    driver.findElementByXPath("//span[text()='Phone']").click();
		    // click on email
		    //driver.findElementByXPath("//span[text()='Email']").click();
		    // enter phone number(areaCode)
		    driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("201");
		    // enter phone number
		    driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234567");
		    // enter email address
		    //driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@abc.com");
		    driver.close();
		    
	}
}
		    
	
		    
		    
