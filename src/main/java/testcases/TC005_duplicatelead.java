package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_duplicatelead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC005";
		testDescription = "duplicate lead page";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName  = "TC005";

	}

	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String email) throws InterruptedException {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickLcrmsfa()
		.clicklead()
		.clickfindlead()
		.clickemail()
		.typeemailid(email)
		.clickFindLeadButton()
		.clickFirstLeadId()
		.clickduplicatelead()
		.clickLleadlistduplicatesubmit()
		.closeBrowser();
		;
		
		
	}



}
