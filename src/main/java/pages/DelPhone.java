package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DelPhone extends ProjectMethods {

	public DelPhone() {		
		PageFactory.initElements(driver,this);	
	}
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Phone')]")
	private WebElement elephone;

	public DelPhone phone(String data) {
		type(elephone, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneCountryCode")
	private WebElement elecountrycode;

	public DelPhone countrycode(String data) {
		type(elecountrycode, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneAreaCode']")
	private WebElement eleareacode;

	public DelPhone areacode(String data) {
		type(eleareacode, data);
		return this;
}
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elephonenumber;

	public DelPhone phonenumber(String data) {
		type(elephonenumber, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement eledelfindleads;

	public DelPhone delfindleads(String data) {
		type(eledelfindleads, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement eledelresult;

	public DelView delresult(String data) {
		type(eledelresult, data);
		return new DelView();
	}
	
}

