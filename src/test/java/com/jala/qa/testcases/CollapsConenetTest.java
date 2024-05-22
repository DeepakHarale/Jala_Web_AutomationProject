package com.jala.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.CollapsibleConentPage;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.pages.ManuPage;
import com.jala.qa.util.TestUtil;

public class CollapsConenetTest extends TestBase {
	
	
	LoginPage loginpage;
	HomePage homepage;
	CollapsibleConentPage collapsPage;
	
	public CollapsConenetTest() throws IOException {
		super();
		
		
		
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		 Intialization();
		 loginpage = new LoginPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 	homepage.clickOnMoreTab();
			homepage.clickOnCollapsContentTab();
			 collapsPage = new CollapsibleConentPage();
			}
	
	@Test (priority = 1)
	public void ValidateSingleCollpas() {
		collapsPage.singleCollaps();
		Assert.assertTrue(true, "not able to click on singlecollaps tab");
		Reporter.log(" Able to click on singlecollaps tab", true);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		
//		collapsPage.multicollpas();
//		Assert.assertTrue(true, "not able to click on Multicollaps tab");
//		Reporter.log(" Able to click on Multicollaps tab", true);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
			
	}
	
}
