package com.jala.qa.pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.base.TestBase;

public class iFramePage extends TestBase{
	
	@FindBy(id = "iframe1")
	WebElement iframe1;
	

	@FindBy(id = "iframe2")
	WebElement iframe2;
	@FindBy(xpath = "//a[@role='button']")
	WebElement toggle;

	@FindBy(id = "iframe3")
	WebElement iframe3;
	
	public iFramePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void checkiframe1() {
		
		driver.switchTo().frame(iframe1);	
		
		
	}
	
public void checkiframe2() throws InterruptedException {
		

		driver.switchTo().frame(iframe2);	
		 toggle.click(); 
//			JavascriptExecutor  js = (JavascriptExecutor)driver;
//			js.executeAsyncScript("window.scrollBy(0,500)");	
			}
	
	

}
