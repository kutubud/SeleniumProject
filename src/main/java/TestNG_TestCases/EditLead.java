package TestNG_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead {

	//public static void main(String[] args) {
	
		@Test
		public void editLead() {
			
	    	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
			
			  ChromeDriver driver = new ChromeDriver();
			  //Load URL
			  driver.get("http://leaftaps.com/opentaps/control/login");
			  //Maximize window
			  driver.manage().window().maximize();
			  
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 //Enter username
			 driver.findElementByCssSelector(".top>input").sendKeys("DemoSalesManager");
			 //Enter password
			 driver.findElementByCssSelector("label[for='password']+input").sendKeys("crmsfa");
			 //Click login button
			 driver.findElementByCssSelector("input[type='submit']").click();
			 //Click CRM/SFA link
			 driver.findElementByLinkText("CRM/SFA").click();
	    	
	    	
	    	
	    	//Click leads link
	    	driver.findElementByLinkText("Leads").click();
	    	//click Find leads link
	    	driver.findElementByLinkText("Find Leads").click();
	    	
	    	//Enter lead ID
	    	driver.findElementByXPath("//input[@name = 'id']").sendKeys("10406");
	    	//enter first name
	    	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
	    	
	    	//enter last name
	    	driver.findElementByXPath("(//input[@name = 'lastName'])[1]").sendKeys("Mali");
	    	
	       //click Find lead button
	    	
	    	driver.findElementByXPath("//button[text()='Find Leads']").click();
			
	
    	//enter company name
    	driver.findElementByXPath("(//input[@name='companyName'])[1]").sendKeys("ABC");
    	
    	//click Find lead button
    	driver.findElementByXPath("//button[text()='Find Leads']").click();	
    	
    	driver.close(); 
			
		}

	}


