package alertconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simplealert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);
		Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    driver.close();
	     
		
		
		

	}

}
