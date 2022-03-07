package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.TestBaseclass;

public class IsValidation {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable{
		driver = TestBaseclass.setup("Gecko");
		TestBaseclass.getUrl("https://ultimateqa.com/simple-html-elements-for-automation/");
		TestBaseclass.navigate(driver, "Maximize");
		//screenshot Method
		TestBaseclass.getScreenShot("C:\\Users\\Banu\\eclipse-workspace\\selenium\\ScreenShots");
		
		//Locating WebElement
		driver.findElement(By.id("idExample")).click();
		
		//gettext method
		WebElement button = driver.findElement(By.xpath("//*[@id=\"post-4690\"]/div[1]/h1"));
		System.out.println(button.getText());
		String actualText = "Button success";
		String expectedText = button.getText();
		System.out.println("Validation" + actualText.equals(expectedText));
		driver.navigate().back();
		
		
		driver.findElement(By.className("buttonClass")).click();
		WebElement cn = driver.findElement(By.xpath("//*[@id=\"post-4690\"]/div[1]/h1"));
		System.out.println(cn.getText());
		String actualClass = "Button success";
		String expectedClass = cn.getText();
		System.out.println("Validation" + actualClass.equals(expectedClass));
		driver.navigate().back();
		
		
		driver.findElement(By.name("button1")).click();
		WebElement name = driver.findElement(By.xpath("//*[@id=\"post-4690\"]/div[1]/h1"));
		System.out.println(name.getText());
		String actualName = "Button success";
		String expectedName = name.getText();
		System.out.println("Validation" + actualName.equals(expectedName));
		driver.navigate().back();
		
		WebElement checkbox = driver.findElement(By.name("vehicle"));
		//Is Displayed Method
		System.out.println("Is Displayed Validation =" + checkbox.isDisplayed());
		// Is Enabled Method
		System.out.println("Is Enabled Validation =" + checkbox.isEnabled());
        checkbox.click();
        //Is Selected Method
        System.out.println("Is Selected Validation =" + checkbox.isSelected());
	}

}
