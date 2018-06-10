package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindEdit extends ProjectMethods {

	public FindEdit() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_industryEnumId")
	private WebElement elename;

	public FindEdit editname( String expectedText) {
		verifyExactText(elename, expectedText);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@value= 'Update']")
	private WebElement eleupdate;

	public editconfirm editupdate( String expectedText) {
		verifyExactText(eleupdate, expectedText);
		return new editconfirm();		
	}
	

}
