package stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginTestCases {

	@Given("^Open Chrome Browser$")
	public void openBrowser() {
		System.out.println("Open Browser");
	}
	@Then("^Launch Gmail Url$")
	public void opengmali() {
		System.out.println("Launched URL");
	}
	@Then("^Enter Valid Username$")
	public void enterUsername() {
			System.out.println("Entred Valid Username");
	}

}
