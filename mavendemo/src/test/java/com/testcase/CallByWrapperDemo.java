package com.testcase;

import java.io.IOException;

public class CallByWrapperDemo {

	public static void main(String[] args) throws IOException {
		
		WrapperDemo demo = new WrapperDemo();
		demo.setupChromeWithWebManager("https://opensource-demo.orangehrmlive.com/");
		demo.setInputText("txtUsername", "Admin");
		demo.setInputText("txtPassword", "admin123");
		demo.submit("btnLogin");
		demo.takeScreenshot("C:\\Users\\Durga\\Desktop\\scrnshot1.png");
		//demo.clickXpath("//*[@id=\"menu_admin_viewAdminModule\"]/b");
		//demo.selectDropDown("searchSystemUser[userType]", "ESS");
		//demo.setInputText("searchSystemUser_userName", "fiona");
		//demo.setInputText("searchSystemUser_employeeName_empName", "Fiona Grace");
		//demo.selectDropDown("searchSystemUser[status]", "Enabled");
		//demo.clickXpath("//*[@id=\"searchBtn\"]");
		//demo.takeScreenshot("C:\\Users\\Durga\\Desktop\\scrnshot2.png");
		demo.clickXpath("//*[@id=\"menu_pim_viewPimModule\"]/b");
		demo.clickXpath("//*[@id=\"menu_pim_addEmployee\"]");
		demo.setInputText("firstName", "Durga");
		demo.setInputText("middleName", "S");
		demo.setInputText("lastName", "M");
		demo.fileUpload("photofile", "C:\\Users\\Durga\\Downloads\\download.jpg");
	
		demo.clickXpath("//*[@id=\"btnSave\"]");
		//demo.close();
		demo.takeScreenshot("C:\\Users\\Durga\\Desktop\\scrnshot2.png");
		
		// TODO Auto-generated method stub

	}

}
