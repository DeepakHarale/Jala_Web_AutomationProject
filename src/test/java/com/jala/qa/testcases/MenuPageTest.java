package com.jala.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.pages.ManuPage;
import com.jala.qa.pages.MultipleTabsPage;
import com.jala.qa.util.TestUtil;

public class MenuPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	
	ManuPage manuepage;
	
	
	public MenuPageTest() throws IOException {
		super();
	
	}

	
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		 Intialization();
		 loginpage = new LoginPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 	homepage.clickOnMoreTab();
			homepage.clickOnmenu();
			 manuepage = new ManuPage();
			}
	
	@Test (priority = 1)
	public void getMenuPageTitle() {
		String title = manuepage.getTitleofMenuPage();
		Assert.assertEquals(title, "Menu","Menu page title not matched");
		Reporter.log("Menu page title matched",true);
	
	}
	
	@Test (priority = 2)
	public void varifyManuInfo() {
		manuepage.clickonTestingTab();
		Assert.assertTrue(true,"Unable to click on tabs");
		Reporter.log(" Succefully all MainManue tabs are cliked",true);
	}
	
	@Test (priority = 3)
	public void varifysubMenuInfo() {
		manuepage.clickOnSubMenu();
		Assert.assertTrue(true,"Unable to click on tabs");
		Reporter.log("Succefully all Submenu tabs are cliked",true);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
			
	}
	
}
