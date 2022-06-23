package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.platformPage;

public class StartMonitoringSteps {
	
	WebDriver driver = null;
	public platformPage lp2;
	
	public StartMonitoringSteps (MySharedClass mySharedClass){
		driver = mySharedClass.startBrowser();
		lp2 = new platformPage(driver);
		
	}
	
	
	@Given("auditor is on login page")
	public void auditor_is_on_login_page() {
		driver.navigate().to("https://platform.acc.amfori.org/ui");
	}

	@When("auditor enters username as {string} and password as {string}")
	public void auditor_enters_username_as_and_password_as(String username, String password) {
		lp2.click2FillUsernameAndPassword(username, password);
		
	}

	@When("auditor is logged in")
	public void auditor_is_logged_in() throws InterruptedException {
	    lp2.go2MonitoringToDo();
	}

	@When("auditor clicks on Bounded Context Monitoring")
	public void auditor_clicks_on_bounded_context_monitoring() {
	    lp2.searchMonitoring2Start();
	}
	
	@Then("the auditor searh the audit to start by {string}")
	public void the_auditor_searh_the_audit_to_start_by(String monitoringID) throws InterruptedException {
	    lp2.fillTheMonitoringKey(monitoringID);
	}
	
	@Then("Open the Monitoring to start")
	public void open_the_monitoring_to_start() throws InterruptedException {
	    lp2.OpenTheMonitoring2Start();
	}
	@Then("Click on the start button and confirm")
	public void click_on_the_start_button() throws InterruptedException {
	    lp2.click2StartMonitoring();
	}
	
	@Then("go to the tab General Description")
	public void go_to_the_tab_general_description() throws InterruptedException {
	    lp2.fillGeneralDescription();
	}
	@Then("Open the Tab Report")
	public void open_the_tab_report() throws InterruptedException {
	    lp2.openTheTabReport();
	}
	
	@Then("Start filling the Monitoring Details")
	public void start_filling_the_monitoring_details() throws InterruptedException {
	    lp2.go2TheMonitoringDetails();
	}


}
