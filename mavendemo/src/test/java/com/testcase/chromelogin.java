package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromelogin {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Durga\\Downloads\\Selenium\\chromedriver.exe");
		
		// TODO Auto-generated method stub	
WebDriverManager.chromedriver().setup();
ChromeOptions options= new ChromeOptions();
//options.setHeadless(true);
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");

	}

}
