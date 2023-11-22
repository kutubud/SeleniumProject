package aUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab_Enter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kutub\\Downloads\\chromedriver_win32\\chromedriver.exe");
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
 driver.findElementByName("email").sendKeys("abc@yahoo.com");
 Actions action=new Actions(driver);
 Thread.sleep(3000);
 action.sendKeys(Keys.TAB).sendKeys("kutub").build().perform();
 action.sendKeys(Keys.ENTER).perform();
 action.sendKeys(Keys.TAB).perform();
 /*action.sendKeys(Keys.TAB)
 .sendKeys("kutub")
 .build().perform();
 action.sendKeys(Keys.ENTER).perform();
 action.sendKeys(Keys.TAB).perform();*/
 
 
 
 Thread.sleep(3000);
 
 
	}

}
