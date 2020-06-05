package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsuponMethod {
	@Test()
	public void login() {
		System.out.println("login");
		
	}
	@Test(dependsOnMethods="login")
	public void search() {
		System.out.println("search");
	Assert.assertEquals("XYZ", "abc");
		
	}
	@Test(dependsOnMethods="Search", alwaysRun=true)
	public void logout() {
		System.out.println("logout");
			
	}


}
