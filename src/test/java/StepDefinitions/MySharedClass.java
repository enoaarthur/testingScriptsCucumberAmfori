package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MySharedClass {
	WebDriver driver = null;
	

	@Before
	public WebDriver startBrowser() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe" );
		
		if(driver==null)
			driver = new ChromeDriver();
		
		
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		 
		
		return driver;
	}
	
	
	 @After
	  public void closeBrowser() { 
		  driver.close(); 
		  driver.quit(); 
		  driver=null;
		}
	 

}
