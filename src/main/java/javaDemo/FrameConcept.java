package javaDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://jqueryui.com/selectable/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.findElementByLinkText("Selectable");
    driver.findElementByXPath("//ol@[id='selectable']/li[2]").click();
    WebElement findElementByClassName = driver.findElementByClassName("demo-frame");
    
    		
	}

}
