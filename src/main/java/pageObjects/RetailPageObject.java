package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	public WebElement testEnvironmentLogo;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountOption;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginOption;

	@FindBy(id = "input-email")
	private WebElement emailField;

	@FindBy(id = "input-password")
	private WebElement passWordField;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDashboard;

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateAccount;

	@FindBy(id = "input-company")
	private WebElement companyField;

	@FindBy(id = "input-website")
	private WebElement webSiteField;

	@FindBy(id = "input-tax")
	private WebElement taxField;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeButton;

	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paypalButton;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankButton;

	@FindBy(id = "input-cheque")
	private WebElement chequePayeeNameField;

	@FindBy(xpath = "//input[@value='1']")
	private WebElement aboutUsCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageOnAffiliatePage;

	public void clickOnMyAccount() {
		myAccountOption.click();
	}

	public void clickOnLoginOption() {
		loginOption.click();
	}

	public boolean isLogoPresent() {
		if (testEnvironmentLogo.isDisplayed())
			return true;
		else
			return false;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void enterUserNameAndPassword(String userNameValue, String passValue) {
		emailField.sendKeys(userNameValue);
		passWordField.sendKeys(passValue);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public boolean successfulLogin() {
		if (myAccountDashboard.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnRegisterForAnAffiliateAccountLink() {
		registerForAnAffiliateAccount.click();
	}

	public void enterCompanyName(String companyNameValue) {
		companyField.sendKeys(companyNameValue);
	}

	public void enterWebSite(String webSiteValue) {
		webSiteField.sendKeys(webSiteValue);
	}

	public void taxIDField(String taxIDValue) {
		taxField.sendKeys(taxIDValue);
	}

	public void selectpaymentMethod(String paymentType) {
		if (paymentType.trim().equalsIgnoreCase("cheque")) {
			if (!chequeButton.isSelected()) {
				chequeButton.click();
			}
		} else if (paymentType.trim().equalsIgnoreCase("paypal")) {
			paypalButton.click();
		} else
			bankButton.click();
	}

	public void enterChequePayeeName(String chequePayeeNameValue) {
		chequePayeeNameField.sendKeys(chequePayeeNameValue);
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public boolean isSuccessMessagePresent() {
		if(successMessageOnAffiliatePage.isDisplayed()) 
			return true;
			else 
			return false;
		
	}
	
	public void clickonAboutUs() {
		aboutUsCheckBox.click();
	}

}
