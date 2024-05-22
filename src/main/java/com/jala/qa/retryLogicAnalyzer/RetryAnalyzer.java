package com.jala.qa.retryLogicAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int counter =0;
	int retryLimit =3;
	
	public boolean retry1(ITestResult result) {
		if(counter<retryLimit) {
			counter++;
			return true;
		}
		
		
		
	return false;	
	}
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}
	


}
