package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateleadPage extends ProjectMethods {
	
	public CreateleadPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecompanyname;
	public CreateleadPage typecompanyname(String data) {
		type(elecompanyname, data);		
		return this;
	}

	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefirstname;
	public CreateleadPage typefirstname(String data) {
		type(elefirstname, data);		
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelastname;
	public CreateleadPage typelastname(String data) {
		type(elelastname, data);		
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using = "smallSubmit")
	private WebElement elesubmit;
	public  ViewleadPage  clicksubmit() {
		click(elesubmit);	
		return new  ViewleadPage();
	}
	
	
	

}
