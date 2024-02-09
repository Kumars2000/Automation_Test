package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Readconfig;
import util.TestBase;

public class Login_page extends TestBase {
	
	Readconfig read = new Readconfig();
	
	

	@FindBy(id = "nav-link-accountList")
	WebElement signbutton;

	@FindBy(id = "ap_email")
	WebElement emailtext;

	@FindBy(id = "continue")
	WebElement continu;

	@FindBy(linkText = "Best Sellers")
	WebElement seller;

	@FindBy(linkText = "Today's Deals")
	WebElement deals;

	@FindBy(linkText = "Mobiles")
	WebElement mob;

	@FindBy(linkText = "Customer Service")
	WebElement cxservice;
	@FindBy(linkText = "Electronics")
	WebElement electro;

	@FindBy(linkText = "New Releases")
	WebElement Releases;

	@FindBy(linkText = "Gift Ideas")
	WebElement ideas;

	@FindBy(linkText = "Home & Kitchen")
	WebElement home;
	
	@FindBy(linkText = "Fashion")
	WebElement fashion;
	@FindBy(linkText = "Amazon Pay")
	WebElement pay;

	// Initializ ing the Page Objects:

	public Login_page() {
		PageFactory.initElements(getdriver(), this);
	}

//	Get the title
	public void verifyTitle() {

		System.out.println("Info : Title of the page is :  " + getdriver().getTitle());

	}

	
	
	public void releases() {
		Releases.click();
	}

	public void gift() {
		ideas.click();
	}

	public void kitchin() {
		home.click();

	}

	public void clicksign() {
		signbutton.click();
	}

	public void email() {
		emailtext.sendKeys("7751948963");

	}

	public void continu() {
		continu.click();
	}

	public void seller() {
		
		seller.click();
	}

	public void deals() {
		deals.click();

	}

	public void mobile() {
		mob.click();

	}
	
	public void Fashion() {
		fashion.click();
	}
	public void Pay() {
		pay.click();
	}
	

	public void service() {
		cxservice.click();
	}

	public void electronic() {
		electro.click();
	}
	
	public void clicksellerlink(String link)
	{
		getdriver().findElement(By.linkText(link)).click();
	}
	public void clickelectroniclink(String link) {
		getdriver().findElement(By.xpath("//span[text()='"+link+"']")).click();
	}
}
