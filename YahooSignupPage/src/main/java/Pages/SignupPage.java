package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.DropdownSelect;

public class SignupPage {

	WebDriver driver;

	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='usernamereg-firstName']")
	private WebElement firstNameInputField;

	@FindBy(xpath = "//input[@id='usernamereg-lastName']")
	private WebElement surNameInputField;

	@FindBy(xpath = "//input[@id='usernamereg-yid']")
	private WebElement emailAddressInputField;

	@FindBy(xpath = "//input[@id='usernamereg-password']")
	private WebElement passwordInputField;

	@FindBy(xpath = "//input[@id='usernamereg-phone']")
	private WebElement mobileNumber;

	@FindBy(xpath = "//select[@id='usernamereg-month']")
	private WebElement selectMonthDropDown;

	@FindBy(xpath = "//input[@id='usernamereg-day']")
	private WebElement dayInput;

	@FindBy(xpath = "//input[@id='usernamereg-year']")
	private WebElement yearInput;

	@FindBy(xpath = "//input[@id='usernamereg-freeformGender']")
	private WebElement genderInput;

	@FindBy(xpath = "//button[@id='reg-submit-button']")
	private WebElement submitButton;

	@FindBy(xpath = "//div[@id='phone-verify-challenge']/h2[@class='heading']")
	private WebElement verifyPhonenumber;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement verificationCode;

	@FindBy(xpath = "//a[@class='termsLink']")
	private WebElement Terms;

	@FindBy(xpath = "//img[@class='full']")
	private WebElement verizonMediaImg;

	@FindBy(xpath = "//a[@class='privacyLink']")
	private WebElement privacyPolicy;

	@FindBy(xpath = "//button[@name='verifyCode']")
	private WebElement sumbmitVerify;

	@FindBy(xpath = "//div[@class='success-txt-container']")
	private WebElement successImage;

	public boolean isSuccessImageDisplayed() {
		return successImage.isDisplayed();
	}

	public void clickOnVerify() {
		sumbmitVerify.click();
	}

	public void clickOnTextMeVerificationCode() {
		verificationCode.click();
	}

	public boolean verifyPrivacyPolicyPage() {
		privacyPolicy.click();
		return verizonMediaImg.isDisplayed();
	}

	public boolean verizonMediaImgDisplayed() {
		return verizonMediaImg.isDisplayed();
	}

	public void clickOnTerms() {
		Terms.click();

	}

	public String isVerifyPhoneNumberTextDIsplayed() {
		verifyPhonenumber.isDisplayed();
		return verifyPhonenumber.getText();

	}

	public void clickOnSubmit() {
		submitButton.click();
	}

	public void enterGender(String gender) {
		genderInput.sendKeys(gender);
	}

	public void enterYear(String year) {
		yearInput.sendKeys(year);
	}

	public void enterDay(String date) {
		dayInput.sendKeys(date);
	}

	public void enterstatus(String month) {
		DropdownSelect.dropdownSelection(month, selectMonthDropDown);

	}

	public void enterMobileNumber(String mobnum) {
		mobileNumber.sendKeys(mobnum);
	}

	public void enterPassword(String password) {
		passwordInputField.sendKeys(password);
	}

	public void enterEmailAddress(String mailId) {
		emailAddressInputField.sendKeys(mailId);
	}

	public void enterSurName(String surname) {
		surNameInputField.sendKeys(surname);
	}

	public void enterFirstName(String firstName) {
		firstNameInputField.sendKeys(firstName);
	}

}
