package Demo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.TestBaseclass;

public class RobotClass {
	public static WebDriver driver;

	public static void main(String[] args)throws Throwable {
		driver = TestBaseclass.setup("Gecko");
		TestBaseclass.getUrl("https://demoqa.com/text-box");
		TestBaseclass.navigate(driver, "Maximize");
		
		driver.get("https://www.facebook.com/");
		
		Robot rc = new Robot();
		
		WebElement username = driver.findElement(By.id("email"));
		username.click();
		rc.keyPress(KeyEvent.VK_R);
		rc.keyPress(KeyEvent.VK_O);
		rc.keyPress(KeyEvent.VK_B);
		rc.keyPress(KeyEvent.VK_O);
		rc.keyPress(KeyEvent.VK_T);
		rc.keyPress(KeyEvent.VK_ENTER);
		

	}

}
