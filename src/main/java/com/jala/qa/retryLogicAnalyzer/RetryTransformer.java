package com.jala.qa.retryLogicAnalyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryTransformer implements IAnnotationTransformer {
	
	
	public void transform(ITestAnnotation annotation,Class testClass, Constructor testCostructor,Method testMethod ) {
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
	
	
	

}
