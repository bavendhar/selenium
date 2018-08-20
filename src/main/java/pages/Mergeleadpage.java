package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Mergeleadpage extends ProjectMethods {
	
	public Mergeleadpage () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using = "//img[@src='/images/fieldlookup.gif']")
	private WebElement eleimage1;
	public  Findleadmerge clickimage1() {
		click(eleimage1);
		switchToWindow(1);
		return new  Findleadmerge();
	}

	@FindBy(how=How.XPATH,using = "(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleimage2;
	public  Findleadmerge clickimage2() {
		click(eleimage2);
		switchToWindow(1);
		return new  Findleadmerge();
	}
	
	@FindBy(how=How.LINK_TEXT,using = "Merge")
	private WebElement elemerge;
	public  Mergeleadpage clickmerge() {
		click(elemerge);
		return this;
		
		
	}
	
	
	@Override
	public void acceptAlert() {
		super.acceptAlert();
	}
	

}
