package AutomationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Banu\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		
		
		String actualTitle = "YouTube";
		String expectedTitle = driver.getTitle();
		System.out.println("Validation "+actualTitle.equals(expectedTitle));
		
		String actualURL = "https://www.youtube.com/";
		String expectedURL = driver.getCurrentUrl();
		
		
		System.out.println("Validation " + actualURL.equals(expectedURL));
		
		driver.navigate().to("https://web.whatsapp.com/");
		
	
		driver.close();
		
		
		

	}

}
