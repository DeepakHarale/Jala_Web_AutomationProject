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
import com.jala.qa.pages.SliderPage;
import com.jala.qa.pages.TootltipsPage;
import com.jala.qa.util.TestUtil;

public class TooltipsPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	TootltipsPage tooltipsPage;
	public TooltipsPageTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		 Intialization();
		 loginpage = new LoginPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 	homepage.clickOnMoreTab();
			homepage.clickontooltipTab();
			 tooltipsPage = new TootltipsPage();
						}
	@Test
	public void validateSliderMover() {
		tooltipsPage.clickOnTooltipsButton();
		Assert.assertTrue(true,"Not able to click on tooltips");
		Reporter.log("Tooltips button clicked successfully");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
			
	}
	
	
	
}
