package com.TestNG;

import org.testng.annotations.Test;

public class ParallelExecution {
	public void Testcase6() {
		System.out.println("Testcase 6");
	}
@Test(priority=1)
public void Testcase7() {
	System.out.println("Testcase 7");
	
}
@Test(priority=2)
public void Testcase8() {
	System.out.println(" Testcase 8");
	
}
}
