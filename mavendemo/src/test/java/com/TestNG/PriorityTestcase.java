package com.TestNG;

import org.testng.annotations.Test;

public class PriorityTestcase
{ 
	@Test(priority=3, description="Testcasefive")
	public void Testcase5() {
		System.out.println("Testcase 5");
	}
@Test(priority=1)
public void Testcase6() {
	System.out.println("Testcase 6");
	
}
@Test(priority=2)
public void Testcase7() {
	System.out.println(" Testcase 7");
	
	
}
}
