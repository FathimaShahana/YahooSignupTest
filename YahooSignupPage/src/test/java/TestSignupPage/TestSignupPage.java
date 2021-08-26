package TestSignupPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.SignupPage;

public class TestSignupPage extends SignupBaseTest {

	@Test(priority = 0)
	public void verifySignupPage() {
		SignupPage signupPageObj = new SignupPage(driver);
		signupPageObj.enterFirstName("testfirstName");
		signupPageObj.enterSurName("testsurname");
		signupPageObj.enterEmailAddress("testmail");
		signupPageObj.enterPassword("TestYahoofh986@qr2");
		signupPageObj.enterMobileNumber("2204167030");
		signupPageObj.enterstatus("May");
		signupPageObj.enterDay("date");
		signupPageObj.enterYear("2000");
		signupPageObj.enterGender("female");
		signupPageObj.clickOnSubmit();

		String actual = signupPageObj.isVerifyPhoneNumberTextDIsplayed();
		String expected = "Verify your phone number";
		Assert.assertEquals(actual, expected);

		signupPageObj.clickOnTextMeVerificationCode();
		signupPageObj.clickOnVerify();
		boolean isSucessDisplayed = signupPageObj.isSuccessImageDisplayed();
		Assert.assertTrue(isSucessDisplayed);
	}

	@Test(priority = 1)
	public void verifyTermPage() {
		SignupPage signupPageObj = new SignupPage(driver);
		signupPageObj.clickOnTerms();
		boolean isDisplayed = signupPageObj.verizonMediaImgDisplayed();
		Assert.assertTrue(isDisplayed);
	}

	@Test(priority = 2)
	public void verifyPrivacyPolicyPage() {
		SignupPage signupPageObj = new SignupPage(driver);
		boolean privacyPolicyIsDisplayed = signupPageObj.verifyPrivacyPolicyPage();
		Assert.assertTrue(privacyPolicyIsDisplayed);

	}

}
