package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Baseclass.TestBaseclass;

public class ActionsClass {
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		driver = TestBaseclass.setup("Gecko");
		TestBaseclass.getUrl("https://demoqa.com/droppable");
		TestBaseclass.navigate(driver, "Maximize");
		
		// creating object for Actionsclass
		Actions ac = new Actions(driver);
		WebElement dclick = driver.findElement(By.xpath("//*[@id=\"droppableExample-tab-accept\"]"));
		
		Thread.sleep(3000);
		//doubleclick
		ac.doubleClick().perform();
		//contextClick
		ac.contextClick().perform();
		Thread.sleep(3000);
		WebElement cHold = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		//click and hold
		ac.clickAndHold(cHold).perform();
		Thread.sleep(2000);
		//release
		ac.release().perform();
		WebElement drop = driver.findElement(By.id("droppable"));
		//Drag and Drop
		//ac.clickAndHold(cHold).moveToElement(drop).release().perform();
		ac.dragAndDrop(cHold, drop).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.className("header-text")).click();
		driver.findElement(By.className("text")).click();
		
		//Locating webelement
		WebElement fname = driver.findElement(By.id("userName"));
		fname.sendKeys("Krishna");
		Thread.sleep(2000);
		
		//keys sequence 1
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("A");
		ac.keyUp(Keys.CONTROL).build().perform();
		
		//keys sequence 2
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("X");
		ac.keyUp(Keys.CONTROL).build().perform();
		
		
		 
		
		
		
	}

}

