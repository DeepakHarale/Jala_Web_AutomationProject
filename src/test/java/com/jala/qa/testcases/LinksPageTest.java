package com.jala.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LinksPage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.util.TestUtil;

public class LinksPageTest extends TestBase {
	

	LoginPage loginpage;
	HomePage homepage;
	LinksPage linkpage;
	public LinksPageTest() throws IOException {
		super();
			}

	
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		 Intialization();
		 loginpage = new LoginPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 homepage = new HomePage();
		 homepage.clickOnMoreTab();
		 homepage.clickOnLinks();
		 linkpage = new LinksPage();
			}
	
	@Test(priority = 1)
	public void validateWorkingLinks() throws IOException, InterruptedException {
		linkpage.getallLinks();
		
	}
	
	 
	@Test (priority = 2)
	public void validatelinks() throws IOException, InterruptedException {
		linkpage.clickOnLinks();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
			
	}

}
