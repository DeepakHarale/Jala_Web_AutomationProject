package com.jala.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.base.TestBase;

public class TootltipsPage extends TestBase{

	@FindBy(id  = "btnTooltip")
	WebElement clicktooltips;
	public TootltipsPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTooltipsButton() {
		clicktooltips.click();
	
	
		
	}

}
