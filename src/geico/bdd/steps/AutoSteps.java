package geico.bdd.steps;

import geico.bdd.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoSteps extends BaseClass{
	
	@Given("user is in the homepage")
	public void user_is_in_the_homepage() {
		homePage.getTitle();
	}

	@When("user input {int} in zipcode")
	public void user_input_in_zipcode(Integer int1) {
		homePage.inputZipCode(int1.toString());
	}

	@When("select auto from product")
	public void select_auto_from_product() {
		homePage.clickAuto();
	}

	@When("click get a quote")
	public void click_get_a_quote() {
		homePage.clickStartMyQuote();
		homePage.clickContinue();
	}

	@Then("user will be in about you page")
	public void user_will_be_in_about_you_page() {
		aboutYou.getTitle("About You");
	}

}
