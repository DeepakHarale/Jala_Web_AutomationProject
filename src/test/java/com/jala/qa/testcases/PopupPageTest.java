package com.jala.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.pages.PopupsPage;
import com.jala.qa.pages.TootltipsPage;
import com.jala.qa.util.TestUtil;

public class PopupPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	PopupsPage popup1;
	public PopupPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		 Intialization();
		 loginpage = new LoginPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 	homepage.clickOnMoreTab();
			homepage.clickOnPopUp();
			 popup1 = new PopupsPage();
			 
			 
			}
	
	@Test (priority = 1)
	public void validatePopUpone() throws InterruptedException {
		popup1.clickOnpopUpOne();
	}
	
	@Test (priority = 2)
	public void validatePopUpTwo() throws InterruptedException {
		popup1.clickOnPopUpTwo();
	}
	

	@Test (priority = 3)
	public void validatePopUpThree() throws InterruptedException {
		popup1.clickOnPopUpThree();
	}
	
	
	@Test (priority = 4)
	public void validatePopUpFour() throws InterruptedException {
		popup1.clickOnPopUpFour();
	}
	
	
	@Test (priority = 5)
	public void validatePopUpFive() throws InterruptedException {
		popup1.clickOnPopUpFive();
	}
	
	@Test (priority = 6)
	public void validatePopUpSix() throws InterruptedException {
		popup1.clickOnSixTab();
	}
	
	@Test (priority = 7)
	public void validateAlertPopUp() throws InterruptedException {
		popup1.clickOnAlertTab();
	}
	
	@Test (priority = 8)
	public void validateConfirmBox1() throws InterruptedException {
		popup1.clickOnConfirmBox();
	}
	
	@Test (priority = 9)
	public void validateConfirmBox() throws InterruptedException {
		popup1.clickOnPromptBtn();
	}
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
			
	}
	
	

}
