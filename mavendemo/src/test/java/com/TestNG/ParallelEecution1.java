package com.TestNG;

import org.testng.annotations.Test;

public class ParallelEecution1 {
	
	@Test
	
	public void Testcase9() {
		System.out.println("Testcase 9");
	}
@Test(priority=1)
public void Testcase10() {
	System.out.println("Testcase 10");
	
}
@Test(priority=2)
public void Testcase11() {
	System.out.println(" Testcase 11");
	
}
}