package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods {
	
	public FindLeads() {		
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFind;

	public FindLeadpage Findlead(String data) {
		type(eleFind, data);
		return new FindLeadpage();
	}

	
	}


