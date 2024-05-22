package com.jala.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.prefs.InvalidPreferencesFormatException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.base.TestBase;

public class TestUtil  {
	static ChromeDriver driver;
	static Workbook book;
	static Sheet sheet;
	public static String TESTDATA_SHEET_PATH= "C:\\ATT\\JalaAssignment-all_pages_with_data\\JalaAssignment_Web_Automation\\src\\main\\java\\com\\jala\\qa\\testdata\\EmployeeData.xlsx";
	String sheetname = "Sheet1";
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPICIT_WAIT =60;
	
	
	
//	################################################## Created By  Array###########################################
	
	public static Object [][] getTestData(String sheetname) throws EncryptedDocumentException, IOException{
		FileInputStream file = null; 
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			 book = WorkbookFactory.create(file);
					
		}catch(InvalidPropertiesFormatException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		 sheet = book.getSheet(sheetname);
		 Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		 for(int i=0; i<sheet.getLastRowNum(); i++) {
			 for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) {
				 data[i][k] = sheet.getRow(i+1).getCell(k).toString();
			 }
		 }
		 return data;
	}
	
//	############################################ TakeScreenShot ########################################


	public static void takeScreenshotAtEndOfTest() throws WebDriverException, IOException {
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currenmtDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currenmtDir+"/screenshots"+System.currentTimeMillis()+".png"));
	}
	


}
