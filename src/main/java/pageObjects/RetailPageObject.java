package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	
	public RetailPageObject() {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath ="//a[text()='TEST ENVIRONMENT']")
	public WebElement testEnvironmentLogo;
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountOption;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginOption;
	
	public void clickOnMyAccount() {
		myAccountOption.click();
	}
	
	public void clickOnLoginOption() {
		loginOption.click();
	}
	
	public boolean isLogoPresent() {
		if(testEnvironmentLogo.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	

}
