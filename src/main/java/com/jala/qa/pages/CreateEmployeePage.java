package com.jala.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jala.qa.base.TestBase;

public class CreateEmployeePage extends TestBase {

	@FindBy(linkText = "Employee")
	WebElement clickonemployee;
	@FindBy(xpath = "//a[text()=' Create ']")
	WebElement createemp;
	
	@FindBy(id="FirstName") WebElement firstname;
	@FindBy(id="LastName") WebElement lastname;  
	@FindBy(id="EmailId") WebElement emailID;
	@FindBy(id="MobileNo") WebElement mobileNo;
	@FindBy(id="DOB") WebElement dateOfBirth;  
	@FindBy(id="rdbMale") WebElement gender;
	@FindBy(id="Address") WebElement address;
	@FindBy(id="CountryId") WebElement countryDropDown;
	@FindBy(id="chkSkill_1") WebElement Skills;
	@FindBy(xpath = "//button[text()='Save']") WebElement Save;
	
	public CreateEmployeePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void clickOnEmployee() throws InterruptedException {
		clickonemployee.click();
		Thread.sleep(5000);
		createemp.click();
		Thread.sleep(3000);
		
	}
	
public void createNewEmployeeInfo(String Fname, String Lname, String gmail, String Mnumber, String addresses) {
		
		firstname.sendKeys(Fname);
		lastname.sendKeys(Lname);
		emailID.sendKeys(gmail);
		mobileNo.sendKeys(Mnumber);
		dateOfBirth.sendKeys("07/09/1998");
		gender.isSelected();
		address.sendKeys(addresses);
		Select select = new Select(countryDropDown);
		select.selectByIndex(5);
		Skills.isSelected();
		Save.click();

	}

}
