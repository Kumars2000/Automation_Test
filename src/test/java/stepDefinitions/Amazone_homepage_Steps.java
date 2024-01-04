package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.PageaManager;

public class Amazone_homepage_Steps extends PageaManager {
	Pages.Login_page p = new Pages.Login_page();
	
	@Given("Open the amazone application and verify the title")
	public void open_the_amazone_application_and_verify_the_title() {
		p.verifyTitle();
	    
	}
	@When("Click on the best seller application")
	public void click_on_the_best_seller_application() {
		
	   
	}
	@Then("Verify the Best seller tab")
	public void verify_the_best_seller_tab() {
	    p.seller();
	}
	
	@Then("Click on the todays deal and verify the todays deal page")
	public void click_on_the_todays_deal_and_verify_the_todays_deal_page() {
	    p.deals();
	}

	
	
}
