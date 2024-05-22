package com.jala.qa.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.jala.qa.base.TestBase;
import com.jala.qa.util.TestUtil;

public class LinksPage extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	LinksPage linkpage;
	@FindBy(tagName  = "a")
	List<WebElement> getworklinks;
	
	@FindBy(xpath = "//*[@id=\"tab_1\"]/div/a[1]")
	WebElement link1;
	
	
	
	
	@FindBy(xpath = "//*[@id=\"tab_1\"]/div/a[2]")
	WebElement link2;
	
	@FindBy(xpath = "//*[@id=\"tab_1\"]/div/a[3]")
	WebElement link3;
	
	@FindBy(linkText = "Broken Links")
	WebElement tab1;
	
	@FindBy(linkText = "Image Links")
	WebElement tab2;
	
	@FindBy(linkText = "Status Codes")
	WebElement tab3;
	
	
	public LinksPage() throws IOException {
	PageFactory.initElements(driver, this);	
	}
	
	public void getallLinks() throws IOException {
		
		System.out.println(getworklinks.size());
	
		for(int i=0; i<getworklinks.size();i++) {
			
			String linkname = getworklinks.get(i).getText();
				
			String geturl = driver.getCurrentUrl();
			System.out.println("Link Name is "+linkname +" and URl is = "+geturl);
			
			
			getworklinks= driver.findElements(By.tagName("a"));
		}
	}
	
	public void clickOnLinks() throws InterruptedException, IOException {
		link1.click();
		driver.close();
		Thread.sleep(500);
		driver.navigate().back();
		
	}

}
