package Demo;

import org.openqa.selenium.WebDriver;

import Baseclass.TestBaseclass;

public class Screenshot {
	
	//Webdriver declaration
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		driver = TestBaseclass.setup("Edge");
		
		TestBaseclass.getUrl("https://demoqa.com/alerts");
		TestBaseclass.navigate(driver, "refresh");
		TestBaseclass.getScreenShot("C:\\Users\\Banu\\eclipse-workspace\\selenium\\ScreenShots");

	}

}
