package AutomationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Banu\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www2.hm.com/en_sg/index.html");
		
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.id("main-search"));
		searchbox.sendKeys("T-shirt");
	
		driver.findElement(By.className("menu__search_submit")).click();
		driver.findElement(By.name("q")).click();
		
		//driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.partialLinkText("Customer")).click();
				
		
		
		
		
	}

}
