package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	 
	ChromeDriver driver;
	@Given("Lounch ChromeBrowser and Load Url")
	public void lounchChromeBrowserAndLoadUrl() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
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

	/*@Given("Enter username as kutub")
	public void enterUsernameAsKutub() {
		driver.findElementById("username").sendKeys(kutub);
	}*/

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
