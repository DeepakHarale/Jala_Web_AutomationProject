package com.jala.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.base.TestBase;
import com.jala.qa.util.TestUtil;

public class MultipleTabsPage extends TestBase {

	@FindBy(xpath = "//a[text()='Plan to Succeed']")
	WebElement tab1;
	
	@FindBy(id = "textbox1")
	WebElement inputfield1;
	@FindBy(id = "textbox2")
	WebElement inputfield2;
	
	
	
	@FindBy(xpath = "//a[text()='UnLearning']")
	WebElement tab2;
	@FindBy(id = "textbox3")
	WebElement inputfield3;
	@FindBy(id = "textbox4")
	WebElement inputfield4;
	
	@FindBy(xpath = "//a[text()='Ways of Unlearning']")
	WebElement tab3;
	@FindBy(id = "textbox5")
	WebElement inputfield5;
	@FindBy(id = "textbox6")
	WebElement inputfield6;
	
	public MultipleTabsPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}

	public String getTitleofMultiplePage() {
	return	driver.getTitle();
		
	}
	
	public void inputValue() {
	inputfield1.sendKeys("hello");
	inputfield2.sendKeys("Jala Acadmey");
	
	}
	
	public void inputValue2() {
		tab2.click();
	inputfield3.sendKeys("hello");
	inputfield4.sendKeys("Jala Acadmey");
	
	}
	
	public void inputValu3() {
		tab3.click();
	inputfield5.sendKeys("hello");
	inputfield6.sendKeys("Jala Acadmey");
	
	}
	
}
