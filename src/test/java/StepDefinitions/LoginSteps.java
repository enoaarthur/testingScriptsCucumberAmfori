package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.platformPage;

public class LoginSteps {
	
	
	WebDriver driver;
	public platformPage lp2;
	
	public LoginSteps (MySharedClass mySharedClass){
		driver = mySharedClass.startBrowser();
		lp2 = new platformPage(driver);
		//System.out.println("Driver class in constructor = " +driver);
		
	}
	@Given("a browser is open")
	public void a_browser_is_open() {
    System.out.println("Inside Steps - user is on login page");
	
	}
	
	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://platform.tst.amfori.org/ui/");
	}

	
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, 
			String password) {
		System.out.println("Inside Steps - user enters username and password ");
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		System.out.println("Inside Steps - user clicks on login button");
		
		lp2.click2Login();
		
		Thread.sleep(5000);
		
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() throws InterruptedException {
	
		
		System.out.println("user is being redirected to homepage");
		
		Thread.sleep(5000);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}

}
