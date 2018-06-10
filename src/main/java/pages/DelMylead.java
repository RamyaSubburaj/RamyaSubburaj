package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DelMylead extends ProjectMethods {

	public DelMylead() {		
		PageFactory.initElements(driver,this);	
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Delete')]")
	private WebElement eledeldatatodel;

	public DelMylead data(String data) {
		type(eledeldatatodel, data);
		return new DelMylead();
	}
}
