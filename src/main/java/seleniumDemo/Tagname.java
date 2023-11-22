package seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kutub\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		List<WebElement>LinkList = driver.findElementsByTagName("div");
		System.out.println(LinkList.size());
		

		//on other way
	    /*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//WebDriverManager.firefoxdriver().setup();
		
		//Using Webdriver interface and create object of ChromeDriver class
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps");
		
	  //driver.get("http://www.indeed.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();

	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    List<WebElement>LinkList = driver.findElements(By.tagName("div"));
	    System.out.println(LinkList.size());

	    
	      */
	}

}
