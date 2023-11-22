package TC_implimentinheritancecConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class EditLead extends ProjectSpecificWrapper {

	//public static void main(String[] args) {
	
		@Test
		public void editLead() {
			
			
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


