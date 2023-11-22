package aUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kutub\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement iteam1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement iteam2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement iteam5 = driver.findElementByXPath("//li[text()='Item 5']");
		Actions action=new Actions(driver);
	
       
		action.keyDown(Keys.CONTROL).click(iteam1).click(iteam2).click(iteam5).release().perform();
		
		
		

	}

}
