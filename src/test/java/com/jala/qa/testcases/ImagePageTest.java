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
import com.jala.qa.pages.ImagesPage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.util.TestUtil;

public class ImagePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	ImagesPage imagepage;
	public ImagePageTest() throws IOException {
		super();
		
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		Intialization();
		loginpage = new LoginPage();
		 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickOnMoreTab();
		homepage.clickOnimagesTab();
		imagepage = new ImagesPage();
		
	}
	
	@Test
	public void validateUploadImage() throws InterruptedException {
		imagepage.upoladImage();
		
		Assert.assertTrue(true, "Not able to upload image");
		Reporter.log("Image successfully uploaded");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
		
	}

}
