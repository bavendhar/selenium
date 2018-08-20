package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LeaftapsPage extends ProjectMethods{
	
	public LeaftapsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using = "CRM/SFA")
	private WebElement elecrmsfa;
	
	public MyHomePage clickLcrmsfa() {
		click(elecrmsfa);
		return new MyHomePage();
	}

}
