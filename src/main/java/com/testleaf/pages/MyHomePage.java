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
public class MyHomePage {
	
WebDriver driver;
	
	By MyHome = By.linkText("My Home");
	
	
	
	By createLead = By.linkText("Create Lead");
	
	public MyHomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickmyHome() {
		
		driver.findElement(MyHome).click();
		
	}
	
	/*public void clickleads() {
		
		
		driver.findElement(leads).click();
		
	}*/
	
	public void clickcreateLead() {
		
		driver.findElement(createLead).click();
	}

}
	

