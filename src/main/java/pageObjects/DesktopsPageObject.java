package pageObjects;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopsPageObject extends Base {
	public DesktopsPageObject() {
		PageFactory.initElements(driver,this);
	}
	
	// syntax for storing UI Element in POM class using PageFactory implementation
	//@FindBy(locatorType= "Locator")
	//AccessModifier WebElement NameOfElement;
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(tagName ="img")
	private List <WebElement> items; // driver.FindElements
	
	public void clickonDesktopsTab() {
		WebDriverUtility.moveToElement(desktops);
	}
	
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public List<WebElement> desktopsItems(){
		List<WebElement> itemsDesk = items;
		return itemsDesk;
	}
	
	// syntax for method
	// accessModifier returnType method name
	

}
