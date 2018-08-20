package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadpage extends ProjectMethods {
	
	public  EditLeadpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement elecompanyname;
	public EditLeadpage typecompanyname(String data) {
		type(elecompanyname, data);		
		return this;
	}

	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement elefirstname;
	public EditLeadpage typefirstname(String data) {
		type(elefirstname, data);		
		return this;
	}
	
	
	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement elelastname;
	public EditLeadpage typelastname(String data) {
		type(elelastname, data);		
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using = "smallSubmit")
	private WebElement elesubmitedit;
	public  Editedviewlead  clicksubmitedit() {
		click(elesubmitedit);	
		return new   Editedviewlead ();
	}
	
	
	
	

}
