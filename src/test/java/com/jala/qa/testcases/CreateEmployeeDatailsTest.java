package com.jala.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;
import com.jala.qa.pages.CreateEmployeePage;
import com.jala.qa.pages.HomePage;
import com.jala.qa.pages.LoginPage;
import com.jala.qa.util.TestUtil;

public class CreateEmployeeDatailsTest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	CreateEmployeePage createwemployee;
	String sheetname = "Sheet1";
	TestUtil utiltest;

	public CreateEmployeeDatailsTest() throws IOException {
		super();
	}

	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		Intialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		createwemployee = new CreateEmployeePage();

	}

	@DataProvider
	public Object[][] testData() throws EncryptedDocumentException, IOException {

		Object data[][] = utiltest.getTestData(sheetname);
		return data;
	}

	@Test(priority = 2, dataProvider = "testData")
	public void VarifyNewEmployeeDetailsCreation(String Fname, String Lname, String gmail, String Mnumber,
			String addresses) throws InterruptedException {
		try {
			utiltest = new TestUtil();

			createwemployee.clickOnEmployee();
			Assert.assertTrue(true, "Employee tab not working");
			Reporter.log("Employee tab and more tab working successfully", true);

			createwemployee.createNewEmployeeInfo(Fname, Lname, gmail, Mnumber, addresses);
			Assert.assertTrue(true, "Employee dtails not created");
			Reporter.log("Employee info successfully saved", true);
		} catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
	}

	@AfterMethod(timeOut = 3000)
	public void tearDown() {

		driver.quit();
	}

}
