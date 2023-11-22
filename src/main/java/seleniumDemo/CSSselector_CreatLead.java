package seleniumDemo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSSselector_CreatLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementByCssSelector("#username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByCssSelector(".decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		   // click leads link
			driver.findElementByLinkText("Leads").click();
			

			// click create lead link

			//driver.findElementByLinkText("Create Lead").click();
			driver.findElementByPartialLinkText("Create").click();

			// company name
			//driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
			driver.findElementByCssSelector("#createLeadForm_companyName").sendKeys("TCS");
			   
		//enter first Name
		try {
			driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		} catch (NoSuchElementException e) {
			System.out.println("The element not found");
			Thread.sleep(2000);
		}
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		//enter Last name
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("M");
		//driver.findElementById("createLeadForm_lastName").sendKeys("M");
		//driver.findElementById("createLeadForm_lastName").sendKeys("J");
		//Enter FirstName Local
		driver.findElementByCssSelector("input#createLeadForm_firstNameLocal").sendKeys("H");
		//driver.findElementByXPath("//input[@ id='createLeadForm_firstNameLocal']").sendKeys("H");
		//Last Name
		driver.findElementByXPath("//input[@ id='createLeadForm_lastNameLocal']").sendKeys("M");
   //Enter solution
		driver.findElementByXPath("//input[@ id='createLeadForm_personalTitle']").sendKeys("ms");
		//choose source
    //
		 WebElement src = driver.findElementById("createLeadForm_dataSourceId");
			Select dd = new Select(src);
			dd.selectByVisibleText("Website");

			// enter Title
			driver.findElementByXPath("//input[@name='generalProfTitle']").sendKeys("MS.");

			// enter Annual revenue
			driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("1000");

			// choose industry
			WebElement element = driver.findElementById("createLeadForm_industryEnumId");
			Select dd1 = new Select(element);
			dd1.selectByVisibleText("Insurance");

			// choose ownership
			WebElement ele = driver.findElementByName("ownershipEnumId");
			Select dd2 = new Select(ele);
			dd2.selectByVisibleText("Sole Proprietorship");

			// enter Sic code
			driver.findElementByXPath("//input[@name='sicCode']").sendKeys("1010");

			// enter description
			driver.findElementByXPath("//textarea[@name='description']").sendKeys("It is a Software Development company");

			// enter important note(using CssSelector)
			driver.findElementByCssSelector("textarea#createLeadForm_importantNote").sendKeys("It's a trusted company");
			// driver.findElementByXPath("//textarea[@name='importantNote']").sendKeys("It's
			// a trusted company");

			// enter country code
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("0088");

			// enter area code
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("682");
			
			//enter phone number
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("2084048");;

			// enter extension
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneExtension']").sendKeys("101");

			// enter department
			driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("QA");

			// choose preferred currency(dropdown)

			WebElement ele1 = driver.findElementById("createLeadForm_currencyUomId");
			Select dd3 = new Select(ele1);
			dd3.selectByVisibleText("BDT - Bangladesh Taka");

			// enter number of employees
			driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("1000");

			// enter Ticker symbol
			driver.findElementByXPath("//input[@name='tickerSymbol']").sendKeys("Tk");

			// Enter Person to Ask For
			driver.findElementByXPath("//input[@name='primaryPhoneAskForName']").sendKeys("Hema");

			// Enter Web Url
			driver.findElementByXPath("//input[@name='primaryWebUrl']").sendKeys("www.google.com");

			// Enter To Name
			driver.findElementByXPath("//input[@name='generalToName']").sendKeys("M");

			// Enter Address Line 1 and 2
			driver.findElementByXPath("//input[@name='generalAddress1']").sendKeys("8821 Saddlehorn Dr");
			// address line 2
			driver.findElementByXPath("//input[@name='generalAddress2']").sendKeys("APT 252");

			// Enter City
			driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("DAL");

			// Chose State/Province
			WebElement element3 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			Select dd4 = new Select(element3);
			dd4.selectByVisibleText("Texas");

			// Choose Country
			WebElement element4 = driver.findElementById("createLeadForm_generalCountryGeoId");
			Select dd5 = new Select(element4);
			dd5.selectByVisibleText("Bangladesh");

			// Enter Zip/Postal Code
			driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("75061");

			// Enter Zip/Postal Code Extension
			driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCodeExt']").sendKeys("111");

			// Choose Marketing Campaign
			WebElement element5 = driver.findElementById("createLeadForm_marketingCampaignId");
			Select dd6 = new Select(element5);
			dd6.selectByVisibleText("Car and Driver");

			// Enter phone number
			driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("682-207-3636");

			// Enter email address
			driver.findElementById("createLeadForm_primaryEmail").sendKeys("hema_77@gmail.com");

			// Click Create lead
			driver.findElementByXPath("//input[@name='submitButton']").click();

			// Verify the first name(for verifying first name, we use getText() and stored
			// the value in firstName and print)

			String firstName = driver.findElementById("viewLead_firstName_sp").getText();
			System.out.println(firstName);

			//System.out.println("Element not found");

			if (firstName.equals("Hema")) {
				System.out.println("Name is Matched");
			} else {
				System.out.println("Not Match");
			}

			driver.close();
			
			/* 
		
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	  ChromeDriver driver = new ChromeDriver();
	  //Load URL
	  driver.get("http://leaftaps.com/opentaps/control/login");
	  //Maximize window
	  driver.manage().window().maximize();
	  
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 driver.findElementByCssSelector("#username").sendKeys("DemoSalesManager");
	 
	 driver.findElementByCssSelector("input[type = 'password']").sendKeys("crmsfa");
	 
	 driver.findElementByCssSelector("input[value = 'Login']").click();
	 
	 driver.findElementByLinkText("CRM/SFA").click();
	 
	 driver.findElementByLinkText("Leads").click();
	 
	 driver.findElementByPartialLinkText("Create ").click();
	 
	 driver.findElementByCssSelector("#createLeadForm_companyName").sendKeys("ABC");
	 
	 driver.findElementByCssSelector("#createLeadForm_firstName").sendKeys("Hema");
	 
	 driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Mali");
	 
	 driver.findElementByCssSelector("input[name = 'firstNameLocal']").sendKeys("H");
	 
	 driver.findElementByCssSelector("#createLeadForm_lastNameLocal").sendKeys("M");
	 
	 driver.findElementByCssSelector("#createLeadForm_personalTitle").sendKeys("MS");
	 
	 driver.findElementByCssSelector("#createLeadForm_generalProfTitle").sendKeys("Ms");
	 
	 
	 //Enter username
	/* driver.findElementByCssSelector(".top>input").sendKeys("DemoSalesManager");
	 //Enter password
	 driver.findElementByCssSelector("label[for='password']+input").sendKeys("crmsfa");
	 //Click login button
	 driver.findElementByCssSelector("input[type='submit']").click();
	 //Click CRM/SFA link
	 driver.findElementByLinkText("CRM/SFA").click();
	 //Click Leads link
	 driver.findElementByLinkText("Leads").click();
	 //Click create lead link
	 driver.findElementByPartialLinkText("Create ").click();
	 //Company name;
	 driver.findElementByCssSelector("#createLeadForm_companyName").sendKeys("TCS");
	 //Enter first name
	 driver.findElementByCssSelector("#createLeadForm_firstName").sendKeys("Hema");
	 //Enter last name
	 driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Mali");
	 //Enter first name local
	 driver.findElementByCssSelector("input[name='firstNameLocal']").sendKeys("H");
	 //Enter last name local
	 driver.findElementByCssSelector("input[name='lastNameLocal']").sendKeys("M");
	 //Enter salutation
	 driver.findElementByCssSelector("input[name='personalTitle']").sendKeys("Ms");
	 //Enter title
	 driver.findElementByCssSelector("#createLeadForm_generalProfTitle").sendKeys("MS");
	 //Enter Annual revenue
	 driver.findElementByCssSelector("input[name='annualRevenue']").sendKeys("1000");
	 //Enter SIC code
	 driver.findElementByCssSelector("input[name='sicCode']").sendKeys("1010");
	 //Enter description
    driver.findElementByCssSelector("#createLeadForm_description").sendKeys("It is a software development company");
	//Enter important note 
    driver.findElementByCssSelector("textarea[name='importantNote']").sendKeys("It's a trusted company");
    //Enter country code
    driver.findElementByCssSelector("input[value='1']").sendKeys("0088");
    //Enter area code
    driver.findElementByCssSelector("#createLeadForm_primaryPhoneAreaCode").sendKeys("999");
    //Enter phone number
    driver.findElementByCssSelector("#createLeadForm_primaryPhoneNumber").sendKeys("9172348765");
    //Enter extension
    driver.findElementByCssSelector("input[name='primaryPhoneExtension']").sendKeys("121");
    //Enter department
    driver.findElementByCssSelector("#createLeadForm_departmentName").sendKeys("QA");
    //Enter number of employees
    driver.findElementByCssSelector("#createLeadForm_numberEmployees").sendKeys("2000");
    //Enter Ticker symbol
    driver.findElementByCssSelector("#createLeadForm_tickerSymbol").sendKeys("TK");
    //Enter person to ask for
    driver.findElementByCssSelector("#createLeadForm_primaryPhoneAskForName").sendKeys("Hema");
    //Enter Web URL
    driver.findElementByCssSelector("input[name='primaryWebUrl']").sendKeys("www.google.com");
    //Enter To name
    driver.findElementByCssSelector("#createLeadForm_generalToName").sendKeys("M");
    //Enter address Line 1 and 2
    driver.findElementByCssSelector("input[id^=createLeadForm_generalAddress1]").sendKeys("25 Green St");
    //address Line 2
    driver.findElementByCssSelector("input[name$=s2]").sendKeys("APT 55");
    //Enter city
    driver.findElementByCssSelector("input[id*=createLeadForm_generalCi]").sendKeys("War");
    //Enter Zip/postal code
    driver.findElementByCssSelector("#createLeadForm_generalPostalCode").sendKeys("52135");
    //Enter Zip/postal code extension
    driver.findElementByCssSelector("input[id^=createLeadForm_generalPostalCodeE]").sendKeys("333");
    //Enter email address
    driver.findElementByCssSelector("#createLeadForm_primaryEmail").sendKeys("hema_77@gmail.com");
    //Chose State/Province
    WebElement element1 = driver.findElementByCssSelector("#createLeadForm_generalStateProvinceGeoId");
    Select dd1 = new Select(element1);
    dd1.selectByVisibleText("Texas");
    //Choose source
    WebElement src = driver.findElementByCssSelector("#createLeadForm_dataSourceId");
             Select dd2 = new Select(src);
             dd2.selectByVisibleText("Website");
    //Choose industry
    WebElement ind = driver.findElementByCssSelector("#createLeadForm_industryEnumId");
           Select dd3 = new Select(ind);
           dd3.selectByVisibleText("Health Care");
     WebElement ownr = driver.findElementByCssSelector("#createLeadForm_ownershipEnumId");
          Select dd4 = new Select(ownr);
          dd4.selectByVisibleText("Partnership");
    //Enter Create lead
    driver.findElementByCssSelector(".smallSubmit").click();
    
    //Verify the first name(for verifying first name, we use getText() and stored the value in firstName and print)
    String firstName = driver.findElementByCssSelector("#viewLead_firstName_sp").getText();
    System.out.println(firstName );
    
   //System.out.println("Element not found");
   
   if(firstName.equals("Hema")) {System.out.println("Name is Matched");
   }else {System.out.println("Not Match");
   }
   
  // driver.close();
      */
		
	/* //Verify title of the page
	  String title = driver.findElementByCssSelector("#sectionHeaderTitle_leads").getText();
	   
	  // String title = driver.getTitle();
	   System.out.println("title");
	   
	   if(title.contains("view")) {
		   System.out.println("title is matched");
	   }else {
		   System.out.println("title not matches");
		     }
	   
	   if(title.equals("view Lead")) {
		   System.out.println("title is matched");
	   }else {
		   System.out.println("title not matches");
	   }
	   driver.close();*/
			 
			
			
		

	}

}
