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
	@Then("click on the Mobile tab and veryfay the page")
	public void click_on_the_mobile_tab_and_veryfay_the_page() {
	    p.mobile();
	}   


@Then("click on the customore service tab and veryfay the page")
public void click_on_the_customore_service_tab_and_veryfay_the_page() {
 p.service();
}
@Then("click on the electronic tab and veryfay the page")
public void click_on_the_electronic_tab_and_veryfay_the_page() {
   p.electronic();
}
@Then("click on new releases tab and veryfay the page")
public void click_on_new_releases_tab_and_veryfay_the_page() {
   p.releases();
}
@Then("click on the gift ideas tab and veryfay the page")
public void click_on_the_gift_ideas_tab_and_veryfay_the_page() {
    p.gift();
}
@Then("click on the Home & Kitchen and veryfay the page")
public void click_on_the_home_kids_and_veryfay_the_page() {
    p.kitchin();
}
@Then("click on the Fashion tab and veryfay the page")
public void click_on_the_fashion_tab_and_veryfay_the_page() {
   p.Fashion();
}
@Then("click on the amazone pay tab and veryfay the page")
public void click_on_the_amazone_pay_tab_and_veryfay_the_page() {
    p.Pay();
}
@When("user click on {string} link")
public void verify_that_the_Best_seller_Quick_access_link(String link) {
   p.clicksellerlink(link);
}
@When("user click on the {string} link")
public void verify_that_the_Electronic_Quick_access_link(String link) {
    p.clickelectroniclink(link);
}
}