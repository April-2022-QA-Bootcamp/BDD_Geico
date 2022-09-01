package geico.bdd.objects;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import geico.bdd.common.CommonFunctions;
import geico.bdd.utils.AutoData;

public class AboutYou {

	WebDriver driver;
	CommonFunctions commons;
	
	public AboutYou(WebDriver driver, CommonFunctions commons) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.commons = commons;
	}
	
	@FindBy(tagName = "h4")
	WebElement titlElement;
	
	@FindBy(tagName = "h3")
	WebElement subTitle;
	
	@FindBy(className = "date")
	WebElement dobElement;
	
	@FindBy(xpath = "//button[contains(.,'Next')]")
	WebElement nextButtonWebElement;
	
	@FindBy(xpath = "//input[@data-formotivid='FirstName']")
	WebElement firstNamElement;
	
	@FindBy(xpath = "//input[@data-formotivid='LastName']")
	WebElement lastNamElement;
	
	@FindBy(xpath = "(//div[@class='row']//p)[1]")
	WebElement errorMsgElement;
	
	public void getTitle(String expected) {
		assertEquals(commons.getText(titlElement), expected);
	}
	
	public void getCurrentUrl(String expectedUrl) {
		assertEquals(commons.getCurrentUrl(driver), expectedUrl);
	}
	
	public void getSubTitle(String expectedSubTitle) {
		assertEquals(commons.getText(subTitle).replaceAll("[^a-zA-Z]",""), expectedSubTitle.replaceAll("[^a-zA-Z]",""));
	}
	
	public void inputDOB(String dob) {
		commons.inputValues(dobElement, dob);
	}
	
	public void clickNext() {
		commons.click(nextButtonWebElement);
	}
	
	public void inputFirstName(String firstName) {
		commons.inputValues(firstNamElement, firstName);
	}
	
	public void inputLastName(String lastName) {
		commons.inputValues(lastNamElement, lastName);
	}
	
	public void getErrorMsg(String expectedError) {
		//assertEquals(commons.getText(errorMsgElement), expectedError);
	}
	
	public void aboutYouSteps(String expected, String expectedUrl, String expectedSubTitle1, String dob, 
			String firstName, String lastName, String expectedSubTitle2, String errorMsg) {
		getTitle(expected);
		getCurrentUrl(expectedUrl);
		getSubTitle(expectedSubTitle1);
		inputDOB(dob);
		clickNext();
		clickNext();
		inputFirstName(firstName);
		inputLastName(lastName);
		getSubTitle(expectedSubTitle2);
		clickNext();
		clickNext();
		getErrorMsg(errorMsg);
	}
	
	public void aboutYouSteps(String expected, String expectedUrl, String expectedSubTitle1, String dob, 
			String firstName, String lastName, String expectedSubTitle2) {
		getTitle(expected);
		getCurrentUrl(expectedUrl);
		getSubTitle(expectedSubTitle1);
		inputDOB(dob);
		clickNext();
		clickNext();
		inputFirstName(firstName);
		inputLastName(lastName);
		getSubTitle(expectedSubTitle2);
		clickNext();
	}
	
	public void aboutYouSteps(AutoData autoData) {
		getTitle(autoData.getExpectedTitle());
		getCurrentUrl(autoData.getExpectedUrl());
		getSubTitle(autoData.getExpectedSubTitle1());
		inputDOB(autoData.getDob());
		clickNext();
		clickNext();
		inputFirstName(autoData.getFirstName());
		inputLastName(autoData.getLastName());
		getSubTitle(autoData.getExpectedSubtitle2());
		clickNext();
	}
}
