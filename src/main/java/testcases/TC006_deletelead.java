package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewleadPage;
import wdMethods.ProjectMethods;

public class TC006_deletelead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC006";
		testDescription = "Login to LeafTaps";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName  = "TC006";

	}

	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String phone, String data) throws InterruptedException {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickLcrmsfa()
		.clicklead()
		.clickfindlead()
		.clickphone()
		.typeenterphone(phone)
		.clickFindLeadButton()
		.getIDText()
		.clickFirstLeadId()
		.clickdeletephonelead()
		.clickfindlead()
		.typeid(text)
		.clickFindLeadButton();
		new ViewleadPage().verifyerrormsg(data);
		
		
	}


}
