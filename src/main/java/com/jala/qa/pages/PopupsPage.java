package com.jala.qa.pages;

import java.io.IOException;

import java.util.Set;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;

import com.jala.qa.base.TestBase;
import java.util.Iterator;
public class PopupsPage extends TestBase {
	Alert alt;
	
	@FindBy(id = "btn-one")
	WebElement popup1;
	@FindBy(linkText = "Gmail")
	WebElement child1;
	
	@FindBy(id = "btn-two")
	WebElement popup2;
	@FindBy(linkText = "Library")
	WebElement library;
	
	
	@FindBy(id = "btn-three")
	WebElement popup3;
	@FindBy(xpath = "//img[@src='/Content/images/home/aspdotnet.png']")
	WebElement img;
	
	@FindBy(id = "btn-four")
	WebElement popup4;
	@FindBy(linkText = " String")
	WebElement stringTab;
	
	@FindBy(id = "btn-five")
	WebElement popup5;
	
	
	@FindBy(id = "btn-six")
	WebElement popup6;
	@FindBy(xpath = "(//button[@type='button'])[3]")
	WebElement button1;
	
	@FindBy(name = "alert")
	WebElement alert;
	
	@FindBy(id = "confirmBox")
	WebElement confirmbox;
	
	
	@FindBy(id = "promptBtn")
	WebElement promptBtn;
	
	public PopupsPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
public void clickOnpopUpOne() throws InterruptedException{
	popup1.click();
	Set<String> AllWindows = driver.getWindowHandles();
	
	System.out.println(AllWindows);
	
	Iterator<String> it=AllWindows.iterator();
	String mainpage = it.next();
	String child = it.next();
	Thread.sleep(1000);
	driver.switchTo().window(child);
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	child1.click();
	driver.close();
	
	driver.switchTo().window(mainpage);
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
}
	


public void clickOnPopUpTwo() throws InterruptedException{
	popup2.click();
	Set<String> AllWindows = driver.getWindowHandles();
	
	System.out.println(AllWindows);
	
	Iterator<String> it=AllWindows.iterator();
	String mainpage = it.next();
	String child = it.next();
	Thread.sleep(1000);
	driver.switchTo().window(child);
	Thread.sleep(20000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	library.click();
	driver.close();
	
	driver.switchTo().window(mainpage);
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
}

public void clickOnPopUpThree() throws InterruptedException{
	popup3.click();
	Set<String> AllWindows = driver.getWindowHandles();
	
	System.out.println(AllWindows);
	
	Iterator<String> it=AllWindows.iterator();
	String mainpage = it.next();
	String child = it.next();
	Thread.sleep(1000);
	driver.switchTo().window(child);
	Thread.sleep(25000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	img.click();
	driver.close();
	
	driver.switchTo().window(mainpage);
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
}


public void clickOnPopUpFour() throws InterruptedException{
	popup4.click();
	Set<String> AllWindows = driver.getWindowHandles();
	
	System.out.println(AllWindows);
	
	Iterator<String> it=AllWindows.iterator();
	String mainpage = it.next();
	String child = it.next();
	Thread.sleep(1000);
	driver.switchTo().window(child);
	Thread.sleep(25000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	stringTab.click();
	driver.close();
	
	driver.switchTo().window(mainpage);
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
}


public void clickOnPopUpFive() throws InterruptedException{
	popup5.click();
	Set<String> AllWindows = driver.getWindowHandles();
	
	System.out.println(AllWindows);
	
	Iterator<String> it=AllWindows.iterator();
	String mainpage = it.next();
	String child = it.next();
	Thread.sleep(1000);
	driver.switchTo().window(child);
	System.out.println(driver.getTitle());
	driver.close();
	
	
	driver.switchTo().window(mainpage);
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
}

	public void clickOnSixTab() throws InterruptedException {
		popup6.click();
		Thread.sleep(1000);
		button1.click();

		
	
	}
	
	public void clickOnAlertTab() throws InterruptedException {
		alert.click();
		Thread.sleep(1000);
		alt = driver.switchTo().alert();
		alt.accept();
	
	}
	
	public void clickOnConfirmBox() throws InterruptedException {
		confirmbox.click();
		Thread.sleep(1000);
		alt = driver.switchTo().alert();
		alt.accept();
		
	}
	
	public void clickOnPromptBtn() throws InterruptedException {
		promptBtn.click();
		Thread.sleep(1000);
		alt = driver.switchTo().alert();
		alt.sendKeys("Jala Acadmy");
		Thread.sleep(1000);
		alt.accept();
		
	}

}
