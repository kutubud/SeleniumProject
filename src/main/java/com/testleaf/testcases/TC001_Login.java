package com.testleaf.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testleaf.pages.LoginPage;
import com.testleaf.pages.MyHomePage;
import com.testleaf.pages.WelcomePage;

public class TC001_Login {
	
	
		
		//5. Create Java method for login and annotated by TestNG @Test, and write the all steps for launch browser and load URL
		@Test
		public void verifyLogin() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			//get url:
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			//window maximize:
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			
			//6. Create Object of LoginPage and pass the driver, call the all methods from LoginPage and quite/close the browser
			LoginPage login = new LoginPage(driver);
			
			login.typeUserName();
			login.typePassWord();
			login.clickLoginButton();
			
			//Create object of Welcome Page and pass the driver, call the all methods from WelcomePage
			WelcomePage wc = new WelcomePage(driver);
			
			wc.clickCRMSFA();
			

			
//Create object of My Home Page and pass the driver, call all the methods form My Home Page
			
			/*MyHomePage MHP = new MyHomePage(driver);
			
			MHP.clickMyHomePage();
			
			//Create object of Create Lead page and pass the driver, call all the methods from Create Lead Page
			
			
			CreateLeadPage CLP = new CreateLeadPage(driver);
			
			CLP.clickCreateLeadPage();
			
			ContactsPage Cont = new ContactsPage(driver);
			
			Cont.clickContactPage();*/
		
			
			driver.quit();
			
		}

	}


