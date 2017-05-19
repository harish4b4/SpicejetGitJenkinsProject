package cucumberRunnerClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SpicejetStepDef {

	 WebDriver  driver ;
	
	@Given("^open firefox and start validation$")
	public void open_firefox_and_start_validation() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\E003690\\Downloads\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.spicejet.com/");
	}
	
	@Given("^user entered valid data in leaving from$")
	public void user_entered_valid_data_in_leaving_from() throws Exception{
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		
	}

	@Then("^user should enter into leaving from$")
	public void user_should_enter_into_leaving_from() throws Exception{
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		System.out.println("Test");
		driver.quit();
	}
}
