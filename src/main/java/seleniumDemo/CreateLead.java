package seleniumDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	
		
	 	driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
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
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.close();
	}

}
