package aUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kutub\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://mrbool.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
WebElement content = driver.findElementByClassName("menulink");
 Actions action=new Actions(driver);
 action.moveToElement(content).perform();
 //then click the Article element(xpath writting with celection)
 driver.findElementByXPath("//a[text()='Articles'])[1]").click();
 Thread.sleep(3000);
 driver.close();
	}

}
