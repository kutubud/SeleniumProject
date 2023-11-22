package javaDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kutub\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		//way-1 -Enter into the frame
			
		//driver.switchTo().frame("iframeResult");
		
		//way-2
		//driver.switchTo().frame(0);
		
		//way-3> WebElement 
		//driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
		
		//OR (we can do it other way)
		WebElement iframe = driver.findElementByXPath("//iframe[@id='iframeResult']");
		driver.switchTo().frame(iframe);
		
		System.out.println("Successfully enter into the frame");
		
		//WebElement iframe = driver.findElementByXPath("//iframe[@id='iframeResult']");
		//driver.switchTo().frame(iframe);
		
		//driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
		
		//driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
		
		driver.findElementByXPath("//input[@value='John']").clear();
		//enter first name
		driver.findElementByXPath("//input[@value='John']").sendKeys("Tushar");
				
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='lname']").clear();
		//enter last name
		driver.findElementByXPath("//input[@id='lname']").sendKeys("Hasan");
		//click submit
		driver.findElementByXPath("//input[@value='Submit']").click();
		
		//Back to main/parent page	
		driver.switchTo().parentFrame();
		
		Thread.sleep(3000);
		driver.close();

   
	}

}
