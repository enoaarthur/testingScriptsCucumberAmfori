package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;
import pageObjects.platformPage;

public class addSitesSteps {
	
	WebDriver driver = null;
	public platformPage lp2;
	
	public addSitesSteps (MySharedClass mySharedClass){
		driver = mySharedClass.startBrowser();
		lp2 = new platformPage(driver);
		
	}
	
	
	@When("member clicks on Bounded Context Admin")
	public void member_clicks_on_bounded_context_admin() {
		lp2.go2AdminBoundaryContext();
	}

	@When("member clicks on SubItem My Sites")
	public void member_clicks_on_sub_item_my_sites() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		lp2.goSubItemMySites();
	   
	}

	@When("member clicks on button Add Site")
	public void member_clicks_on_button_add_site() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		lp2.clickAddSiteButton();
	  
	}

	@When("member enters the Legal Name {string}, the {string} and the {string}")
	public void member_enters_the_legal_name_the_and_the(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		
		lp2.click2FillNewSiteDetails(string, string2, string3);
	    
	}

	@When("Member selects the country and the Province")
	public void member_selects_the_country_and_the_province() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		lp2.click2FillCountryAndStateOrProvince();
	}

	@When("Member selects the Sector, the Industry Group, the Industry and the Sub Industry")
	public void member_selects_the_sector_the_industry_group_the_industry_and_the_sub_industry() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		lp2.click2SelectSectorIndustryAndSubIndustry();
	    
	}

	@When("Member clicks the the button Add Site")
	public void member_clicks_the_the_button_add_site() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		lp2.clickConfirmAddSiteButton();
	   
	}


}
