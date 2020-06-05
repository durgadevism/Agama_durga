package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testcase.WrapperDemo;

public class ParallelExecHomewrk {
	private WrapperDemo demo = null;
	
	@BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Test");
		  
		  demo = new WrapperDemo();
		  demo.setupChromeWithWebManager("https://opensource-demo.orangehrmlive.com/");
		 	
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("after Test");
		  
		  demo.close();
	  }
	  
	  
	

@Test(priority =1)

public void login()
{

	demo.setInputText("txtUsername", "Admin");
	demo.setInputText("txtPassword", "admin123");
	demo.submit("btnLogin");
}

@Test(priority =2)
public void clickAdmin()
{
	
	demo.clickXpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
	demo.selectDropDown("searchSystemUser[userType]", "ESS");
	demo.setInputText("searchSystemUser_userName", "fiona");
	demo.setInputText("searchSystemUser_employeeName_empName", "Fiona Grace");
	demo.selectDropDown("searchSystemUser[status]", "Enabled");
	demo.clickXpath("//*[@id=\"searchBtn\"]");

}

}
