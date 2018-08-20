package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_mergelead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC004";
		testDescription = "merge lead";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName  = "TC004";

	}

	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String fname,String faname) throws InterruptedException {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickLcrmsfa()
		.clicklead()
		.clickmergelead()
		.clickimage1()
		.typefirstname1(fname)
		.clickbutton1()
		.clicklink1()
		.clickimage2()
		.typefirstname2(faname)
		.clickbutton2()
		.clicklink2()
		.clickmerge()
		.acceptAlert();
		
		
		
	}
	
	
	
}
