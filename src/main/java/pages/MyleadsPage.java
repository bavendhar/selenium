package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyleadsPage extends ProjectMethods {

	
	public MyleadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using = "Create Lead")
	private WebElement elecreatelead;
	
	public CreateleadPage clickcreatelead() {
		click(elecreatelead);
		return new CreateleadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using = "Find Leads")
	private WebElement elefindlead;
	
	public FindleadPage clickfindlead() {
		click(elefindlead);
		return new FindleadPage();
	}
	
	@FindBy(how=How.LINK_TEXT,using = "Merge Leads")
	private WebElement elemergelead;
	
	public Mergeleadpage clickmergelead() {
		click(elemergelead);
		return new  Mergeleadpage();
	}
	
	@Override
	public void closeBrowser() {
		super.closeBrowser();
	}
}
