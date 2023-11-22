package alertconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kutub\\Downloads\\chromedriver_win32");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
	Alert PromptAlert = driver.switchTo().alert();
	PromptAlert.getText();
	Thread.sleep(3000);
	PromptAlert.sendKeys("I am JS Pormpt");
	PromptAlert.accept();
	
	
 	
	

	}

}
