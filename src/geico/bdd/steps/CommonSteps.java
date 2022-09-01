package geico.bdd.steps;

import geico.bdd.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonSteps extends BaseClass{

	
	@Given("user is in the homepage")
	public void user_is_in_the_homepage() {
		homePage.getTitle();
	}

	@When("user input {int} in zipcode")
	public void user_input_in_zipcode(Integer int1) {
		homePage.inputZipCode(int1.toString());
	}
}
