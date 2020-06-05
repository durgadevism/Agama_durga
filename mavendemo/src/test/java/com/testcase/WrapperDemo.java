package com.testcase;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrapperDemo { 
	private WebDriver driver = null;
	
	public void setupChrome(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Durga\\Downloads\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	public void setupChromeWithWebManager(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public void setupFireFox(String url) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Durga\\Downloads\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		
	}
	public void setInputText(String id,String value) {
		driver.findElement(By.id(id)).sendKeys(value);
	}
	public void submit(String id) {
		driver.findElement(By.id(id)).submit();
	}
	
	public void takeScreenshot(String fileWithPath) throws IOException
	{
	TakesScreenshot scrnshot = (TakesScreenshot) driver;	
	File SrcFile =scrnshot.getScreenshotAs(OutputType.FILE);
	File DestFile=new File(fileWithPath);
    FileUtils.copyFile(SrcFile, DestFile);
	}	
	public void clickXpath(String Xpath) {
		driver.findElement(By.xpath(Xpath)).click();
		
	}
	
	public void selectDropDown(String Name,String Value) 
	{
		Select drp=new Select(driver.findElement(By.name(Name))) ;
		
		drp.selectByVisibleText(Value);
	}
	
	public void fileUpload(String id,String value)
	{
		driver.findElement(By.id(id)).sendKeys(value);
		
		
	}
	
	public void close()
	{
		
		driver.close();
		
}
	
public void quit()
{

driver.quit();

}
}