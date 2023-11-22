/**
 * 
 */
package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author kutub
 *
 */
public class WelcomePage {
	 

	//1. Create Reference variable of WebDriver
	WebDriver driver ;
	
	
//2. Create All the locator of WelcomePage
By crmsfa = By.linkText("CRM/SFA");


//3. Create Constructor of WelcomePage
public WelcomePage(WebDriver driver) {
		
this.driver = driver;
		

}

//4. Create methods for all locators one by one
	public void clickCRMSFA() {
		
		driver.findElement(crmsfa).click();
	}
}


