package utils;

import java.io.File;

public class ConfigurationSettings { // TODO: Read settings from Configuration file 
	
	public static String driverPath = getApplicationPath() + "\\src\\main\\resources\\chromedriver.exe";
	
	public static String appUrl = "https://login.yahoo.com/account/create?src=fpctx&intl=in&lang=en-IN&done=https%3A%2F%2Fin.yahoo.com&specId=yidReg%5C";
	
	private static String getApplicationPath()
	{
		try {
			return new File(".").getCanonicalPath();
		}
		catch (Exception ex) {
			return "C:\\";
		}
	}
}
