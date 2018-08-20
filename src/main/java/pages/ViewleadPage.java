package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewleadPage extends ProjectMethods {
	
	public ViewleadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using = "Edit")
	private WebElement eleedit;
	public  EditLeadpage clickedit() {
		click(eleedit);
		return new  EditLeadpage();
	}

	
	@FindBy(how=How.LINK_TEXT,using = "Duplicate Lead")
	private WebElement eleduplicatelead;
	public Duplicateleadpage clickduplicatelead() {
		click(eleduplicatelead);
		return new Duplicateleadpage();
	}
	
	@FindBy(how=How.LINK_TEXT,using = "Delete")
	private WebElement eledeletephonelead;
	public MyleadsPage clickdeletephonelead() {
		click(eledeletephonelead);
		return new  MyleadsPage ();
	}

	@FindBy(how=How.XPATH,using = "//div[text()='No records to display']")
	private WebElement eleverify;
	public ViewleadPage verifyerrormsg(String data) {
		verifyPartialText(eleverify, data);
		return this;
	}
	
	
	}
	
	
	
	


