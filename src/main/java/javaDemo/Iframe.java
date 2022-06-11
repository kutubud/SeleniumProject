package javaDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.switchTo().frame("iframeResult");
		/*driver.switchTo().frame("//iframe[@id='iframeResult']");
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
    driver.findElementByXPath("//input[@value='john']").click();*/
   
	}

}
