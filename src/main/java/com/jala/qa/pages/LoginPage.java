package com.jala.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.jala.qa.base.TestBase;

public class LoginPage extends TestBase {
	

	@FindBy(id="UserName") 
	WebElement username;
	@FindBy(id="Password")  
	WebElement password;
	@FindBy(id="btnLogin") 
	WebElement loginbtn;
	@FindBy(xpath = "//b[text()='JALA Academy']")
	WebElement visibletext;
	
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginPageTitle() {
	return driver.getTitle();
		
	}
	
	public boolean ValidateLoginPageText() {
		return visibletext.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) throws IOException 
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
	}
	
	
	
	

}
