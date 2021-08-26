package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {
	
	public static void dropdownSelection(String text,WebElement element)
	{
		Select userTypeobj = new Select(element);
		userTypeobj.selectByVisibleText(text);
	}

}
