package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteTest {
	
	@BeforeSuite
	
	public void suiteStart(){
		
		System.out.println("Before Test Suite ...");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		
		System.out.println("After Test Suite ...");
	}

}
