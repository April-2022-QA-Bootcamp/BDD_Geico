package geico.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import geico.bdd.common.CommonFunctions;
import geico.bdd.utils.AutoData;

public class HomePage {

	CommonFunctions commons;
	WebDriver driver;
	
	public HomePage(WebDriver driver, CommonFunctions commons) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.commons = commons;
	}
	
	@FindBy(id = "ssp-service-zip")
	WebElement zipCodElement;
	@FindBy(xpath = "//div[@class='card' and @data-product='auto']")
	WebElement autoProductElement;
	@FindBy(xpath = "(//div[@class='card' and @data-product='homeowners'])[1]")
	WebElement homeProductElement;
	@FindBy(xpath = "//a[text()='Start My Quote']")
	WebElement startMyQuotElement;
	@FindBy(id = "submitBtn")
	WebElement startMyHomeQuotElement;
	@FindBy(xpath = "(//input[@value='Continue'])[1]")
	WebElement continuElement;
	
	public void inputZipCode(String value) {
		commons.inputValues(zipCodElement, value);
	}
	
	public void clickAuto() {
		commons.click(autoProductElement);
	}
	
	public void clickHome() {
		commons.click(homeProductElement);
	}
	
	public void clickStartMyQuote() {
		commons.click(startMyQuotElement);
	}
	
	public void clickStartMyHomeQuote() {
		commons.click(startMyHomeQuotElement);
	}
	
	public void clickContinue() {
		commons.click(continuElement);
	}
	
	public void getTitle() {
		commons.getCurrentUrl(driver);
	}
	
	public void homepageAutoSteps(String value) {
		inputZipCode(value);
		clickAuto();
		clickStartMyQuote();
		clickContinue();
	}
	
	public void homepageAutoSteps(AutoData autoData) {
		inputZipCode(autoData.getZipCode());
		clickAuto();
		clickStartMyQuote();
		clickContinue();
	}
	
	public void homepageHomeSteps(String value) {
		inputZipCode(value);
		clickHome();
		clickStartMyHomeQuote();
	}
}
