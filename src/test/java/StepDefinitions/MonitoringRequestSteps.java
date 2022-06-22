package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.platformPage;

public class MonitoringRequestSteps {
	
	WebDriver driver = null;
	public platformPage lp2;
	
	public MonitoringRequestSteps (MySharedClass mySharedClass){
		driver = mySharedClass.startBrowser();
		lp2 = new platformPage(driver);
		
	}
	
	
	
	@Given("member is on login page")
	public void member_is_on_login_page() {
		driver.navigate().to("https://platform.tst.amfori.org/ui/");
	}
	   
	
	@When("member enters username as {string} and password as {string}")
	public void member_enters_username_as_and_password_as(String username, String password) {
		
		lp2.click2FillUsernameAndPassword(username, password);
	}

	@When("member is logged in")
	public void member_is_logged_in() {
		System.out.println("The Member is now logged in ");
	}

	@When("member clicks on Bounded Context Monitoring")
	public void member_clicks_on_bounded_context_monitoring() throws InterruptedException {
		//driver.findElement(By.xpath("//a[@href='/ui/monitoring/requested-monitorings']")).click();
		
		lp2.go2MonitoringRequestPage();
		//Thread.sleep(2000);
	}

	@When("member clicks on button Request Monitoring")
	public void member_clicks_on_button_request_monitoring() throws InterruptedException {
		//driver.findElement(By.xpath("//button[@id='request-monitoring']")).click();
		lp2.requestANewMonitoring();
		//Thread.sleep(2000);
	}

	@When("member selects the Business Partner he wants to audit and Member clicks on Next Step")
	public void member_selects_the_business_partner_he_wants_to_audit_and_member_clicks_on_next_step() throws InterruptedException {
		//driver.findElement(By.xpath("//table[@id='monitoredPartyOverview']/tbody/tr/td[2]")).click();
		
        //driver.findElement(By.xpath("//button[@id='wizard-submit-button']")).click();
		
		lp2.selectMonitoredParty();
        //Thread.sleep(2000);
	}

	@When("Member selects the site and clicks next")
	public void member_selects_the_site_and_clicks_next() throws InterruptedException {
		
		lp2.selectTheMonitoredPartySite();
        //driver.findElement(By.xpath("//table[@id='monitoredSiteOverview']/tbody/tr[1]")).click();
		
        //driver.findElement(By.xpath("//button[@id='wizard-submit-button']")).click();
		Thread.sleep(2000);
		
	}

	@When("Member selects the initiative, the activity, the announcement type, the time window and clicks on Next Step twice")
	public void member_selects_the_initiative_the_activity_the_announcement_type_the_time_window_and_clicks_on_next_step_twice() throws InterruptedException {
		
		lp2.selectInitiative_Activity_Announcement_And_TimeWindow();
	}

	@When("Member selects the Monitoring Party and clicks on Request")
	public void member_selects_the_monitoring_party_and_clicks_on_request() {
		
		lp2.selectMonitoingPartner();
		
	    
	}

	@Then("the message {string} should be displayed")
	public void the_message_should_be_displayed(String string) {
		
		Assert.assertEquals(string, lp2.l2driver.findElement(By.xpath("//div[@id='success-container']/div")).getText());
	
		//WebElement container = lp2.l2driver.findElement(By.xpath("//div[@id='success-container']/div"));
		
	   //System.out.println(container.getText());
			   
	}
}