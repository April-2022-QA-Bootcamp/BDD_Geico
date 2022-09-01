package geico.bdd.steps;

import geico.bdd.base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoSteps extends BaseClass{

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

	@Then("user will be in {string} page")
	public void user_will_be_in_page(String string) {
		aboutYou.getTitle(string);
	}
	
	@Then("url of the page is {string}")
	public void url_of_the_page_is(String string) {
		aboutYou.getCurrentUrl(string);
	}
	
	@Then("subtitle of the page is {string}")
	public void subtitle_of_the_page_is(String string) {
		aboutYou.getSubTitle(string);
	}
}
