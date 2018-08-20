package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_Createlead extends ProjectMethods {
	
	
	
	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC002";
		testDescription = "Login to LeafTaps";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName  = "TC002";

	}

	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String cname,String fname,String lname) {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickLcrmsfa()
		.clicklead()
		.clickcreatelead()
		.typecompanyname(cname)
		.typefirstname(fname)
		.typelastname(lname)
		.clicksubmit()
		;
		
		
	}


	

}
