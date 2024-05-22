package com.jala.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.jala.qa.base.TestBase;

public class ImagesPage extends TestBase{

	@FindBy(name = "file")
	WebElement chooseimage;
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement uploadimage;
	
	public ImagesPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void upoladImage() {
		chooseimage.sendKeys("C:\\Users\\Sarvadnya\\eclipse-workspace\\JalaAcadamyTest\\src\\main\\java\\com\\jala\\qa\\testdata\\Image.jpg");
		uploadimage.click();
	}

}
