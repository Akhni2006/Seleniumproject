package Demo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;





public class Assertion {

 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Banu\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycareersfuture.gov.sg/");
		String expectedURL = ("https://www.mycareersefuture.gov.sg/");
		
		
		Assert.assertEquals("https://www.mycareersefuture.gov.sg/", expectedURL);
		
		
		
	}	

}