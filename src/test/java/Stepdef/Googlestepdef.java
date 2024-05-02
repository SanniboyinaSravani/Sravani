package Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;


public class Googlestepdef {
	public WebDriver driver;
	public String actT;
	@Given("Browser should open app should launch")
	public void browser_should_open_app_should_launch() {
	 driver=new EdgeDriver();
		driver.get("https://www.Google.com");
	    
	}

	@When("User capture Tittle of google page")
	public void user_capture_tittle_of_google_page() {
		  actT=driver.getTitle();
	    
	}

	@Then("Expected and Actual Tittle should match")
	public void expected_and_actual_tittle_should_match() {
		if(actT.contains("Google")) {
			System.out.println("Tc is pass");
		}
		else
			System.out.println("Tc is fail");
		}
	   
	}




