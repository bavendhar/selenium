package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindleadPage extends ProjectMethods{
	
	public  FindleadPage () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleid;
	public FindleadPage typeid(String data) {
		type(eleid, text);		
		return this;
	}
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement elefirstname;
	public FindleadPage typefirstname(String data) {
		type(elefirstname, data);		
		return this;
	}

	@FindBy(how=How.XPATH,using = "//span[text()='Email']")
	private WebElement eleemail;
	public FindleadPage clickemail() {
		click(eleemail);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleemailid;
	public FindleadPage typeemailid(String data) {
		type(eleemailid, data);		
		return this;
	}
	@FindBy(how=How.XPATH,using = "//span[text()='Phone']")
	private WebElement elephone;
	public FindleadPage clickphone() {
		click(elephone);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement eleenterphone;
	public FindleadPage typeenterphone(String data) {
		type(eleenterphone, data);		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elephonefind;
	public FindleadPage clickFindLeadButton() throws InterruptedException{
		click(elephonefind);
		Thread.sleep(2000);
		return this;
	}

	
	@FindBy(how=How.XPATH,using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleleadldText;
	public FindleadPage getIDText() {
		text = eleleadldText.getText();
		System.out.println(text);
		return this;
	}
	
	@FindBy(how=How.XPATH,using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement elefirstLeadId;
	public ViewleadPage clickFirstLeadId() throws InterruptedException {
		click(elefirstLeadId);
		return new  ViewleadPage();
	}
	/*@FindBy(how=How.XPATH,using = "//button[text()='Find Leads']")
	private WebElement elefind;
	public FindleadPage clickLfind() throws InterruptedException {
		click(elefind);
		Thread.sleep(2000);
		return this;
	}*/
	
	
	/*@FindBy(how=How.XPATH,using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleleadlist;
	public FindleadPage clickLleadlist() throws InterruptedException {
		click(eleleadlist);
		Thread.sleep(2000);
		return this;
	}*/
	
	//for duplicate lead
	
	
	
	
	/*@FindBy(how=How.XPATH,using="(//button[@type='button'])[7]")
	private WebElement eleduplicatefind;
	public FindleadPage clickduplicatefind() throws InterruptedException{
		Thread.sleep(2000);
		click(eleduplicatefind);
		return this;
	}*/
	
	/*@FindBy(how=How.XPATH,using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleleadlistduplicate;
	public ViewleadPage clickLleadlistduplicate() {
		click(eleleadlistduplicate);
		return new ViewleadPage();
	}*/
	
	//for delete lead
	
	
	
	
	
	

}
