
package com.jala.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	HomePage homepage;
	LoginPage loginpage;
	public LoginPageTest() throws IOException {
		super();
		
	}
	
	
	
	static Logger log = Logger.getLogger(LoginPageTest.class);
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		log.info("****************************** Starting test cases execution  *****************************************");

		Intialization();
		log.info("launching chrome broswer");
		loginpage = new LoginPage();
		log.info("entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("this is debug message");
	}
	
	@Test(priority = 1)
	public void logintext() throws IOException {
		
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test (priority = 2)
	public void loginPageTitle() {
		log.info("****************************** starting test case *****************************************");
		log.info("****************************** freeCrmTitleTest *****************************************");
		String title = loginpage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Login");
		log.info("****************************** ending test case *****************************************");
		log.info("****************************** freeCrmTitleTest *****************************************");

	}
	
	@Test (priority = 3)
	public void loginPageVisibletext() {
		
		 boolean text = loginpage.ValidateLoginPageText();
		Assert.assertTrue(text);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
		log.info("****************************** Browser is closed *****************************************");
		
	}
}
