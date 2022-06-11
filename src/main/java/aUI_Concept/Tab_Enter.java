package aUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab_Enter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
 driver.findElementByName("email").sendKeys("abc@yahoo.com");
 Actions action=new Actions(driver);
 
 Thread.sleep(3000);
 action.sendKeys(Keys.TAB);
 
	}

}
