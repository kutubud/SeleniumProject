package integrateDataProviderExcel;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.beust.jcommander.Parameters;

import readExcel.ReadExcel;

public class ProjectSpecificWrapper {

		
		public ChromeDriver driver;
			
			@Parameters({"url","uname","pwd"})
		
		
			//maximize
			driver.manage().window().maximize();

			//load URL
			driver.get(url); 

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			//Enter Username - (Element level)
			driver.findElementById("username").sendKeys(uname);

			//Enter Password - (Element level)
			driver.findElementById("password").sendKeys(pwd);

			// Click Login Button - (Element level)
			driver.findElementByClassName("decorativeSubmit").click();

			// click crm.sfa link
			driver.findElementByLinkText("CRM/SFA").click();
		}
		@AfterMethod
		public void closeBrowser() { 
			driver.close();
		}
		
		@DataProvider
		public String[][] getData() throws IOException {
		//public String[][] getData() {
			
			ReadExcel r1 = new ReadExcel();
			  return r1.readExcel();
			
			/*String[][] data = new String[2][3];
			
			data[0][0] = "TCS";
			data[0][1] = "Sumayla";
			data[0][2] = "Chowdhury";
			
			data [1][0] = "ABC";
			data [1][1] = "Nazmul";
			data [1][2] = "Islam";*/
						
			//return data;

			

			 }
}
		
	

