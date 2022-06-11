package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 //bottom line is accept by insfact
 driver.findElementById("accept-choices").click();
 //click on-try it yourself
 
 driver.findElementByPartialLinkText("Try it Yourself ").click();
//For Current window
 String FirstWindow = driver.getWindowHandle();
 System.out.println("1st window reference = "+ FirstWindow);
 // 2.getwindowHandels()-retuns all window reference
 Set<String> allwin =driver.getWindowHandles();
 //System.out.println(allwin);
 for(String eachwin : allwin) {
	 System.out.println(eachwin);
	 driver.switchTo().window(eachwin);
	 System.out.println(driver.getTitle());
	 driver.switchTo().frame("iframeResult");
	 Thread.sleep(2000);
	 //click on ry it button
	 driver.findElementByXPath("//button[text()='Try it']").click();
	 driver.quit();
 }
   
        
      
       
        
        
        
        
       
        
    
}
 
	
 }
 
 




