package Demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Baseclass.TestBaseclass;

public class WindowsHandling {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = TestBaseclass.setup("Gecko");
		TestBaseclass.navigate(driver, "Maximize");
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		//Extracting window ID 1
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		//clicking new tab button
		driver.findElement(By.id("tabButton")).click();
		
		//Extracting window ID 2
		String childWindow = driver.getWindowHandle();
		
		//switching to parentwindow
		driver.switchTo().window(parentWindow);
		
		//clicking new tab button
		driver.findElement(By.id("tabButton")).click();
		
		//Extracting window ID 3
		//String childWindow2 = driver.getWindowHandle();
		
		//using window handles
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		//for-Each loop
		for(String controlVariable : windowHandles) {
			if(controlVariable.equalsIgnoreCase(parentWindow)) {
				driver.close();
		
			}
			
			
		}
		driver.quit();
	}
}
		
		
		
		
		
		
		
		

	


