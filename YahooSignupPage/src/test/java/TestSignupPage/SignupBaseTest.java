package TestSignupPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigurationSettings;
import utils.WaitUtils;

public class SignupBaseTest {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ConfigurationSettings.driverPath); //"webdriver.chrome.driver","ConfigurationSettings.path");

		driver = new ChromeDriver();

		driver.get(ConfigurationSettings.appUrl);
		WaitUtils.getImplicitWait(driver);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Yahoo";
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@AfterMethod
	public void terminateBrowser() {
		driver.quit();
	}

}
