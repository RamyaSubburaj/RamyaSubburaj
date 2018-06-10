package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Findviewlead extends ProjectMethods{
	
	public Findviewlead() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleverify;
	
	public Findviewlead verifyFname( String expectedText) {
		verifyExactText(eleverify, expectedText);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Edit')]")
	private WebElement eleedit;
	
	public FindEdit edit( String expectedText) {
		verifyExactText(eleedit, expectedText);
		return new FindEdit();		
	}	

}
