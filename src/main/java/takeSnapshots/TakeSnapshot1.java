package takeSnapshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnapshot1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
	    driver.findElementById("password").sendKeys("crmsfa");
	    driver.findElementByClassName("decorativeSubmit").click();
	    driver.findElementByLinkText("CRM/SFA").click();
	    driver.findElementByLinkText("Leads").click();
	    driver.findElementByLinkText("Create Lead").click();
	    //driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
	    
	    try {
	    
	    driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	    System.out.println("First name entered");
	    }catch(Exception E1) {
	    	System.err.print("First name not entered");
	    }
	    try {
	    driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
	    		System.out.println("Lastname enter successfully");
	}catch(Exception E2) {
		System.err.print("Lastname not enter successfully");
	}
	    finally {
	    	File snap = driver.getScreenshotAs(OutputType.FILE);
	    	File dest= new File("./snap/kutub.png");
	    	FileUtils.copyFileToDirectory(snap, dest);
	    	
	}
	    	
	    	
	    }
		
	}


