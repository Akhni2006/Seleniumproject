package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Baseclass.TestBaseclass;

public class Frames {
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable{
		driver = TestBaseclass.setup("Gecko");
		TestBaseclass.navigate(driver, "Maximize");
		TestBaseclass.getUrl("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//switch using Index
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("Testing");
		
		//switch using Name/ID
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		//switch to parentframe
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		
		//switch using webElement
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"animals\"]"));
		Select st = new Select(dropdown);
		st.selectByIndex(2);
		Thread.sleep(2000);
		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"animals\"]"));
		Select st1 = new Select(dropdown1);
		st1.selectByVisibleText("Avatar");
		
		
		
		

	}

}

