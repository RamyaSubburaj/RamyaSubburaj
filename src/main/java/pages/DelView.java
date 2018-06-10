package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DelView extends ProjectMethods {

	public DelView() {		
		PageFactory.initElements(driver,this);	
	}
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement eledel;

	public DelMylead phone(String data) {
		type(eledel, data);
		return new DelMylead();
	}

}
