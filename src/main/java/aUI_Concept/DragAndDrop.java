package aUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kutub\\Downloads\\chromedriver_win32\\chromedriver.exe" );
ChromeDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
driver.switchTo().frame(0);
WebElement src = driver.findElementById("draggable");
 
WebElement dest = driver.findElementById("droppable");
Thread.sleep(3000);
Actions action=new Actions(driver);
action.dragAndDrop(src, dest).perform();

//driver.switchTo().defaultContent();
driver.switchTo().parentFrame();
//Thread.sleep(2000);
//driver.close();


	
	
	}

}
