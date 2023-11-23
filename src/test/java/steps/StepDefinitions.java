package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	 
	ChromeDriver driver;
	@Given("Lounch ChromeBrowser and Load Url")
	public void lounchChromeBrowserAndLoadUrl() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    
	}

	@Given("Enter username as (.*)")
	public void enterUsernameAsDemoSalesManager(String username) {
		driver.findElementById("username").sendKeys(username);
	}

	@Given("Enter password as (.*)")
	public void enterPasswordAsCrmsfa(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	    
	}
	
	@When("click  the login button")
	public void clickTheLoginButton() {
	    driver.findElementByClassName("decorativeSubmit").click();
	}


	

	@Then("it's navigated homepage")
	public void itSNavigatedHomepage() {
		System.out.println(driver.getTitle());
	}

	@Then("click the logout button")
	public void clickTheLogoutButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("close browser")
	public void closeBrowser() {
		driver.close();
	}
	/*@Given("Launch chrome browser and load url")
	public void launchChromeBrowserAndLoadUrl() {
	    
	}*/

	@Given("Enter Password as crmsfa")
	public void enterPasswordAsCrmsfa() {
		driver.findElementById("username").sendKeys("crmsfa");
	    
	}

	
	    
	

	@Given("Click CRMSFA")
	public void clickCRMSFA() {
	    driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("Click leads link")
	public void clickLeadsLink() {
	    driver.findElementByLinkText("Leads").click();
	}

	@When("Click createLead")
	public void clickCreateLead() {
	    driver.findElementByLinkText("Create Lead").click();
	}

	@When("Enter the company name as (.*)")
	public void enterTheCompanyNameAsABC(String CName) {
		driver.findElementById("createLeadForm_companyName").sendKeys("CName");
	
	    
	}

	@When("Enter the firstname as (.*)")
	public void enterTheFirstnameAsHema(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys("fName");
	    
	}

	@When("Enter the lastname as (.*)")
	public void enterTheLastnameAsMali(String lastName) {
		driver.findElementById("createLeadForm_lastName").sendKeys("lastName");
	    
	}

	@When("Choose source as Website")
	public void chooseSourceAsWebsite() {
	    WebElement src = driver.findElementById("createLeadForm_dataSourceId");
	    Select dd = new Select(src);
	    		dd.selectByVisibleText("Website");
	}

	@When("Click the create lead button")
	public void clickTheCreateLeadButton() {
	    driver.findElementByClassName("smallSubmit").click();
	}

	@Then("It's navigated ViewLeadPage")
	public void itSNavigatedViewLeadPage() {
	    System.out.println(driver.getTitle());
	}

	@Then("Verify the firstname")
	public void verifyTheFirstname() {
	    String fName = driver.findElementById("viewLead_firstName_sp").getText();
	    System.out.println(fName);
	    if (fName.equalsIgnoreCase("Hama")) {
	    	System.out.println("First name is matched");
	    	
	    }else {
	    	System.out.println("First name is not matched");
	    }
	    
	}

	

	



	

	@Then("it's navigated same page")
	public void itSNavigatedSamePage() {
		System.out.println(driver.getTitle());
	}

	@Then("Verify error message")
	public void verifyErrorMessage() throws InterruptedException {
		Thread.sleep(2000);
		
     String text = driver.findElementById("errorDiv").getText();
		if (text.contains("The Following Errors Occurred")) {
			System.out.println("Error message is matched");
		}else {
			System.out.println("Error message is not matched");
		
		}		
	}


}


//testing this line

//another line