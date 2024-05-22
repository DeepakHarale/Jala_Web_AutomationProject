package com.jala.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.base.TestBase;

public class ManuPage extends TestBase {
	

	@FindBy(xpath = "//a[text()='Testing']")
	WebElement tab1;
	
	@FindBy(xpath = "//a[text()='Java']")
	WebElement tab2;
	
	@FindBy(xpath = "//a[text()='.Net']")
	WebElement tab3;
	
	
	@FindBy(xpath = "//a[text()='Java']")
	WebElement submenu;
	
	@FindBy(xpath = "//a[text()='Testing']")
	WebElement subtab1;
	
	@FindBy(xpath = "//a[text()='Java']")
	WebElement subtab2;
	
	@FindBy(xpath = "//a[text()='.Net']")
	WebElement subtab3;
	
	
	public ManuPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleofMenuPage() {
		return	driver.getTitle();
			
		}
	public void clickonTestingTab() {
		tab1.click();
		System.out.println("Visible text is ="+tab1.getText());
		tab2.click();
		System.out.println("Visible text is ="+tab2.getText());
		tab3.click();
		System.out.println("Visible text is ="+tab3.getText());
	}
		
	public void clickOnSubMenu() {
	
		submenu.click();
		subtab1.click();
		System.out.println("Visible text is ="+subtab1.getText());
		subtab2.click();
		System.out.println("Visible text is ="+subtab2.getText());
		subtab3.click();
		System.out.println("Visible text is ="+subtab3.getText());
	}

}
