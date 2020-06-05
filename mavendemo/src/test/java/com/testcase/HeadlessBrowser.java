package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new HtmlUnitDriver();
driver.get("https://www.facebook.com/");
System.out.println("Title is "+driver.getTitle());

	}

}
