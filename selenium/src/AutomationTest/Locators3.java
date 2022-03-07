package AutomationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Banu\\eclipse-workspace\\selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");	
	}

}
