package com.jala.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.base.TestBase;

public class AutocompletePage extends TestBase {

	@FindBy(name = "txtSingleAutoComplete")
	WebElement textsinglevalue;
	
	@FindBy(xpath = "//a[text()='Multiple Values']")
	WebElement tab2;
	
	@FindBy(name = "txtMultipleAutoComplete")
	WebElement textmulticomplte;
	
	public AutocompletePage() throws IOException {
		PageFactory.initElements(driver, this);
		}
	
	
	public void singleValue() {
		textsinglevalue.sendKeys("Jala Acadamy");
				}
	public void multipleValue() {
		tab2.click();
		textmulticomplte.sendKeys("Jala Acadamy");
		
				}

}
