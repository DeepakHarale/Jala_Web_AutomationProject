package com.jala.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.pages.MultipleTabsPage;
import com.jala.qa.util.TestUtil;

public class MultilpleTabsTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	MultipleTabsPage multpipletab;
	
	public MultilpleTabsTest() throws IOException {
		super();
	
	}
	
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		 Intialization();
		 loginpage = new LoginPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 
		  multpipletab = new MultipleTabsPage();
			homepage.clickOnMoreTab();
			homepage.ClickonMultipleTab();
			}
	
	@Test (priority = 1)
	public void getTitleOfMultileTabPage() throws IOException {
		
	
		String title = multpipletab.getTitleofMultiplePage();
		Assert.assertEquals(title, "Multiple Tabs", "Page is not matching with title");
		Reporter.log("Multiple tab page title matched", true);
	}
	
	@Test (priority = 2)
	public void tabFirsttextField() {
		multpipletab.inputValue();
		Assert.assertFalse(false, "Unable to enter in text field ");
		Reporter.log("Text entered successfully", true);
	}
	
	@Test (priority = 3)
	public void tabFirsttextField2() {
		multpipletab.inputValue2();
		Assert.assertFalse(false, "Unable to enter in text field ");
		Reporter.log("Text entered successfully", true);
	}
	
	@Test (priority = 4)
	public void tabFirsttextField3() {
		multpipletab.inputValu3();
		Assert.assertFalse(false, "Unable to enter in text field ");
		Reporter.log("Text entered successfully", true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
			
	}
	
}
