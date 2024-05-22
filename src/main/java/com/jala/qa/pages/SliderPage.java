package com.jala.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import com.jala.qa.base.TestBase;

public class SliderPage extends TestBase{
	Actions action;
	@FindBy(xpath = "//*[@id=\"blue\"]/div[1]/div[4]")
	WebElement slider;

	public SliderPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void slider() {
		action = new Actions(driver);
        action.clickAndHold(slider);
//		action.moveToElement(slider, 50, 0).perform();
        action.moveByOffset(600, 150);
        action.build().perform();
        
        
	}
	
	

}
