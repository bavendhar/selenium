package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Duplicateleadpage extends ProjectMethods{
	
	public  Duplicateleadpage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how=How.XPATH,using = "//input[@name='submitButton']")
	private WebElement eleleadlistduplicatesubmit;
	public ViewleadPage clickLleadlistduplicatesubmit() {
		click(eleleadlistduplicatesubmit);
		return new ViewleadPage();
	}
	
	@Override
	public void closeBrowser() {
		super.closeBrowser();
	}
	
	
	
}
