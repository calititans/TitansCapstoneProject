package stepDef;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPageObject;
import utilities.WebDriverUtility;

public class RetailStepDefinition extends Base {
	RetailPageObject retail = new RetailPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_Retail_website() {
	Assert.assertTrue(retail.isLogoPresent());
	Assert.assertEquals("TEK SCHOOL", retail.getTitle());
	logger.info("user is on Retail Website");
	WebDriverUtility.takeScreenShot();
	}
	
	@And("User click  on MyAccount")
	public void user_click_on_MyAccount() {
		retail.clickOnMyAccount();
		logger.info("user clicked on MyAccount option");
		
	}
	@When("User click on Login")
	public void user_click_on_login() {
		retail.clickOnLoginOption();
		logger.info("user clicked on Login Option");
		WebDriverUtility.takeScreenShot();
	}
	@And("User enter username {string} and password {string}")
	public void user_enter_userName_and_password(String userName,String password) {
		
	}
	@And("User click on Login button")
	public void user_click_on_login_button() {
		
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_Myaccount_dashboard() {
		
	}
	
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {

	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {

	}
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {

	}
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
	   
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	    
	   
	}
	
	
	

}
