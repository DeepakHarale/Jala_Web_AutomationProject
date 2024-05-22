package com.jala.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.util.TestUtil;

public class HomePgaeTest extends TestBase {
	 HomePage  homepage;
	 LoginPage loginpage;
	 TestUtil testutil;
	 
	public HomePgaeTest() throws IOException {
		super();
			}
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		Intialization();
		 loginpage = new LoginPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	
	@Test (priority =1)
	public void VerifyTitleHomePage() throws InterruptedException{
		String title = homepage.getTitleHomePage();
		Assert.assertEquals(title, "Magnus","Title not matched");
	}
	
	@Test (priority =2)
	public void verifyHomeVisibletext() {
		String visibletext = homepage.getHomeVisibletext();
		Assert.assertEquals(visibletext, "Welcome to JALA Academy", "Visible text not Matched");
		
	}
	@Test (priority =3, timeOut = 3000)
	public void VerifyUserId() {
		String userid = homepage.getUserId();
		Assert.assertEquals("Guest User", userid, "User id not matched");
	}
	
	@Test (priority =4, timeOut = 3000)
	public void VerifyHomepageTotalLiks() {
		homepage.getVisibleLinksOnHomePgae();
		Assert.assertTrue(true);
	}
	@Test (priority =5, timeOut = 3000)
	public void VarifyClickOnEmployeeLink() throws InterruptedException, IOException {
		homepage.clickOnEmployee();
		Assert.assertTrue(true);
	}
		
	@Test(priority =5)
	public void clickOnMultiplePageTab() throws InterruptedException, IOException {
		
		homepage.ClickonMultipleTab();
		Assert.assertTrue(true, "Not able to click on Multiple Tab option");
	}

	
	@AfterMethod (timeOut = 3000)
	public void tearDown(){
		
		driver.quit();
	}

}
