package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WaitUtils {
	public static void getImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
}
