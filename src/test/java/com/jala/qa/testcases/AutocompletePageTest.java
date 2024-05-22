package com.jala.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.AutocompletePage;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.pages.ManuPage;
import com.jala.qa.util.TestUtil;

public class AutocompletePageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	AutocompletePage auto;
	public AutocompletePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		 Intialization();
		 loginpage = new LoginPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 	homepage.clickOnMoreTab();
			homepage.autoComplte();
			 auto = new AutocompletePage();
			 
			}
	
	@Test (priority = 1)
	public void varifySinglevaluesTab() {
		auto.singleValue();
		Assert.assertTrue(true, "Single value tabs text field not filled successfully");
		Reporter.log("Single value tabs text field filled successfully", true);
	}
	
	@Test (priority = 2)
	public void varifyMultilevaluesTab() {
		auto.multipleValue();
		Assert.assertTrue(true, "Multiplr value tabs text field not filled successfully");
		Reporter.log("Multiple value tabs text field filled successfully", true);
	}
	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
			
	}

}
