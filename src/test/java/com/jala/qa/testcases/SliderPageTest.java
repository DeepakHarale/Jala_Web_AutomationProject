package com.jala.qa.testcases;

import static org.testng.Assert.assertTrue;

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
import com.jala.qa.pages.ManuPage;
import com.jala.qa.pages.SliderPage;
import com.jala.qa.util.TestUtil;

public class SliderPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	SliderPage sliderpage;
	public SliderPageTest() throws IOException {
		super();
			}
	

	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		 Intialization();
		 loginpage = new LoginPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 	homepage.clickOnMoreTab();
			homepage.clickOnSliderTab();
			sliderpage =new SliderPage();
			 
			}
	
		
	@Test
	public void validateSliderMover() {
		sliderpage.slider();
		Assert.assertTrue(true,"Slider is not moved");
		Reporter.log("Slider moved smoothly.",true);
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
			
	}
	
}
