package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SolarProject {
	
	


	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kutub\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
	
		driver.get("http://solar.schoolnewgen.com/websolar/dashboard");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("email")).sendKeys("super_admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("secret");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[3]/div[2]/button")).click();
		
		
		//Dropdown
		
		//driver.findElementByName("company");
		
		
	}

	
}


// test this line of code