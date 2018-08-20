package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Findleadmerge extends ProjectMethods {

	public Findleadmerge () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using =  "//input[@name='firstName']")
	private WebElement elefirstname;
	public Findleadmerge typefirstname1(String data){
		click(elefirstname);
		return this;
	}
	
	@FindBy(how=How.XPATH,using = "//button[@type='button']")
	private WebElement elebutton1;
	public  Findleadmerge clickbutton1() throws InterruptedException {
		Thread.sleep(2000);
		click(elebutton1);
		return this;
	}
	
	@FindBy(how=How.XPATH,using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement elelink1;
	public  Mergeleadpage clicklink1() {
		click(elelink1);
		switchToWindow(0);
		return new Mergeleadpage();
	}
	
	
	
	
	
	
	
	
	
	@FindBy(how=How.XPATH,using =  "//input[@name='firstName']")
	private WebElement elefirstname2;
	public Findleadmerge typefirstname2(String data){
		click(elefirstname2);
		return this;
	}
	
	@FindBy(how=How.XPATH,using = "//button[@type='button']")
	private WebElement elebutton2;
	public  Findleadmerge clickbutton2() throws InterruptedException {
		Thread.sleep(2000);
		click(elebutton2);
		return this;
	}
	
	@FindBy(how=How.XPATH,using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement elelink2;
	public  Mergeleadpage clicklink2() {
		click(elelink2);
		switchToWindow(0);
		return new Mergeleadpage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
