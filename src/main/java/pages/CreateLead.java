package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompName;
	
	public CreateLead enterCompName(String data) {
		type(eleCompName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLead enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelastName;
	
	public CreateLead enterlastName(String data) {
		type(elelastName, data);
		return this;
	}

		
		
		@FindBy(how=How.NAME,using="submitButton")
		private WebElement elecreatelead;

		public ViewLead createlead() {
			click(elecreatelead);
			return new ViewLead();		
		}
		

}
