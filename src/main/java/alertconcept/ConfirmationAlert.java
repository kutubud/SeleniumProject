package alertconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
  ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Create Lead");
driver.findElementByLinkText("Merge Leads").click();
driver.findElementByLinkText("Merge").click();
String ComAlert = driver.switchTo().alert().getText();
System.out.println(ComAlert);
Thread.sleep(3000);
//click on OK or accept alert
//driver.switchTo().alert().accept().accept
//click on Cancel or dismiss alert
//driver.switchTo().alert().dismiss();
	}

}
