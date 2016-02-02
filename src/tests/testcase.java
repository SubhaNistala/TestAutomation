package tests;

import org.apache.commons.logging.Log;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;


//import mx4j.log.Logger;
import setup.BaseTest;
import uipages.Login;

public class testcase extends BaseTest{
	
	@BeforeMethod
	
	
	public void startup(){
		setup();
		System.out.println("Executing before method");
		Reporter.log("Usig reporrter to log");
		

		
	}
	
	
	@Test (groups = {"smoke"}, enabled = true, dependsOnMethods = {"loginTwo"})
	
	public void login(){
		System.out.println("testing");
		Login lg = new Login(driver);
		lg.equals(driver);
	
	}
	
	@Test 
	
	public void loginTwo(){
		
		System.out.println("test");
		
	}
	
	
	@AfterMethod()
	public void closeBrowser(){
	
		driver.close();
		
	}
	
	
	@DataProvider(name = "test")
	public Object[][] getData(){
		Object[][] data = new Object[2][2];
		data[0][0] = "abcd";
		data[0][1] = "xyz";
		data[1][1] = "123";
		data[1][2] = "678";
		
		return data;
		
		
		
	}
}