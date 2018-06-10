package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadpage extends ProjectMethods {


	public FindLeadpage() {		
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.NAME,using="firstName")
	private WebElement eleFname;

	public FindLeadpage Fname(String data) {
		type(eleFname, data);
		return new FindLeadpage();
		//return this; both are same
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elefindlead;

	public FindLeadpage ClickFindlead() {
		click(elefindlead);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='10003']")
	private WebElement eleresultinglead;

	public ViewLead resultinglead() {
		click(eleresultinglead);
		return new ViewLead();		
	}
	
	
	}


