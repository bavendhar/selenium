package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_Editlead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC003";
		testDescription = "edit lead";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName  = "TC003";

	}

	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String fname,String cname,String finame,String laname) throws InterruptedException {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickLcrmsfa()
		.clicklead()
		.clickfindlead()
		.typefirstname(fname)
		.clickFindLeadButton()
		.clickFirstLeadId()
		.clickedit()
		.typecompanyname(cname)
		.typefirstname(finame)
		.typelastname(laname)
		.clicksubmitedit()
		;
		
		
	}
}
