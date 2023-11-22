package javaDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Creatleadxpath {

	public static void main(String[] args) throws InterruptedException {
		
	

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kutub\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.firefoxdriver().setup();
	
		ChromeDriver driver = new ChromeDriver();
	
		// maximize
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
		// load URL
		driver.get("http://leaftaps.com/opentaps");

		// Enter Username - (Element level)
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
				
		// Enter Password - (Element level)
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");

		// Click Login Button - (Element level)
		driver.findElementByXPath("//input[@value='Login']").click();

		// click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
	
		
		//click leads
		driver.findElementByXPath("//a[text()='Leads']").click();
		

		//click create lead link
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		//company name
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");

		// enter firstName
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
	
		/*try {
			driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		} catch (NoSuchElementException e) {
			System.out.println("The element not found");
		}*/
		
		Thread.sleep(2000);
		// throw new Exception();

		// enter lastName
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("M");
		// Choose source
		WebElement src = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");
		
		// choose ownership
		WebElement ele = driver.findElementByXPath("//select[@name='ownershipEnumId']");
		Select dd2 = new Select(ele);
		dd2.selectByVisibleText("Sole Proprietorship");
		
		// Click Create lead
		driver.findElementByXPath("//input[@name='submitButton']").click();

		//Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
				
	            /*	if(title.contains("View")) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title not Matched");
		}*/
				
		//close browser
		driver.close();


	}

}
