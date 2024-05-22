package com.jala.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.jala.qa.base.TestBase;
import com.jala.qa.util.TestUtil;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/center/h1")
	WebElement gethometext;
	@FindBy(xpath = "/html/body/div[2]/aside/section/div/div[2]/p[1]")
	WebElement getuserid;
	@FindBy(tagName = "a")
	WebElement getlinks;
	@FindBy(linkText = "Employee")
	WebElement clickonemployee;
	@FindBy(xpath = "//a[text()=' Create ']")
	WebElement createemp;
	@FindBy(xpath = "//*[@id=\"MenusDashboard\"]/li[3]/a")
	WebElement more;
	@FindBy(xpath = "//a[text()=' Multiple Tabs']")
	WebElement mulipletabs;
	@FindBy(xpath = "//a[text()=' Menu']")
	WebElement menu;
	@FindBy(xpath = "//a[text()=' Autocomplete']")
	WebElement autocomlete;
	@FindBy(xpath = "//a[text()=' Collapsible Content']")
	WebElement collapsibleconent;
	@FindBy(xpath = "//a[text()=' Images']")
	WebElement images;
	@FindBy(xpath = "//a[text()=' Slider']")
	WebElement slider;
	@FindBy(xpath = "//a[text()=' Tooltips']")
	WebElement tooltips;
	@FindBy(xpath = "//a[text()=' Popups']")
	WebElement popups;
	@FindBy(xpath = "//a[text()=' Links']")
	WebElement links;
	@FindBy(xpath = "//a[text()=' CSS Properties']]")
	WebElement cssproperties;
	@FindBy(xpath = "//a[text()=' iFrames']")
	WebElement iframe;
	
	@FindBy(xpath = "//a[text()=' Home ']")
	WebElement home;
	
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public String getTitleHomePage() throws InterruptedException {
		Thread.sleep(2000);
		return driver.getTitle();
		
		
	}
	
	public String getHomeVisibletext() {
		return gethometext.getText();	 
	}
	
	public String getUserId() {
		return getuserid.getText();
	}
	
	public void getVisibleLinksOnHomePgae() {
		System.out.println("Total no. of links = "+ getlinks.getSize());
		 
	}
	
	public void navigateToHomePage() {
		home.click();
	}
	
	public void clickOnMoreTab() {
		more.click();
	}
	
	public CreateEmployeePage clickOnEmployee() throws InterruptedException, IOException {
		clickonemployee.click();
		System.out.println("Cliked on Employee Manue");
		createemp.click();
		System.out.println("Clicked on Create Page");
		
		return new CreateEmployeePage();
	}

	
	
	public MultipleTabsPage ClickonMultipleTab() throws IOException {
		
		mulipletabs.click();
		return new MultipleTabsPage();
			}
	
	public ManuPage clickOnmenu() throws IOException {
		menu.click();
		return new ManuPage();
	}
	
	public AutocompletePage autoComplte() throws IOException {
		autocomlete.click();
		
		return new AutocompletePage();
	}
	
	
	public CollapsibleConentPage clickOnCollapsContentTab() throws IOException {
		collapsibleconent.click();
		return new CollapsibleConentPage();
	}
	
	public ImagesPage clickOnimagesTab() throws IOException {
		images.click();
		return new ImagesPage();
	}
	
	public SliderPage clickOnSliderTab() throws IOException {
		slider.click();
		return new SliderPage();
	}
	
	public TootltipsPage clickontooltipTab() throws IOException {
		tooltips.click();
		
		return new TootltipsPage();
	}
	
	public PopupsPage clickOnPopUp() throws IOException {
		popups.click();
	
		return new PopupsPage();
	}
	
	
	
	public LinksPage clickOnLinks() throws IOException {
		links.click();
		return new LinksPage();
	}
	
	public iFramePage clickoniframe() throws IOException {
		iframe.click();
		return new iFramePage();
	}
}
