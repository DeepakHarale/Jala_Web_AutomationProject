package com.jala.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.base.TestBase;

public class CollapsibleConentPage extends TestBase{

	
	@FindBy(xpath = "//*[@id=\"headingOne\"]/h4/a")
	WebElement siglecollaps1;
	
	@FindBy(xpath = "(//a[@role='button'])[1]")
	WebElement button;
	
	@FindBy(xpath = "//a[text()='Multiple Collapse']")
	WebElement multicollapstab;
	
	@FindBy(xpath = "//*[@id=\"headingFour\"]/h4/a")
	WebElement multicollapstab1;
	
public CollapsibleConentPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

public void singleCollaps() {
	siglecollaps1.click();	
	button.click();
}

public void multicollpas() {
	multicollapstab.click();
	multicollapstab1.click();
	
}
	
}
