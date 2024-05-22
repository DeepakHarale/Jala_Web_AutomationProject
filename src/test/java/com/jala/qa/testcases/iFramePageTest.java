package com.jala.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.pages.ManuPage;
import com.jala.qa.pages.iFramePage;
import com.jala.qa.util.TestUtil;

public class iFramePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	iFramePage iframe;
	public iFramePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		 Intialization();
		 loginpage = new LoginPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 	homepage.clickOnMoreTab();
			homepage.clickoniframe();
			 iframe = new iFramePage();
			}
	
	@Test(priority = 1)
	public void ValidateiFrame1() {
		iframe.checkiframe1();
	}
	
	
	@Test(priority = 2)
	public void ValidateiFrame2() throws InterruptedException {
		iframe.checkiframe2();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
			
	}
	

}
