package TC_implimentinheritancecConcept;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class CreatLead extends ProjectSpecificWrapper {

	//public static void main(String[] args) {
		
	@Test
	public void creatLead() {
		//click creatlead
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd= new Select(src);
		dd.selectByVisibleText("Conference");
		
		WebElement mkt = driver.findElementById("createLeadForm_marketingCampaignId");
		Select mk = new Select(mkt);
		mk.selectByValue("9002");
		WebElement indus = driver.findElementById("createLeadForm_industryEnumId");
		Select dd1 = new Select(indus);
		dd1.selectByVisibleText("Aerospace");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		WebElement own = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ow =new Select (own);
		ow.deselectByVisibleText("Partnership");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
	
		
		
	}

	}


