package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Baseclass.TestBaseclass;

public class SelectClassTask {
public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		driver = TestBaseclass.setup("Gecko");
		TestBaseclass.getUrl("https://www.facebook.com/");
		TestBaseclass.navigate(driver, "Maximize");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Swetha");
		WebElement surName = driver.findElement(By.name("lastname"));
		surName.sendKeys("Badhani");
		WebElement mail = driver.findElement(By.name("reg_email__"));
		mail.sendKeys("avm402060@gmail.com");
		WebElement confirmmail = driver.findElement(By.name("reg_email_confirmation__"));
		confirmmail.sendKeys("avm402060@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
		password.sendKeys("Spr730840");
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.id("day"));
		//object creation for selectclass
		Select st = new Select(dropdown);
		//by Index
		st.selectByIndex(3);
		WebElement dropdownMonth = driver.findElement(By.name("birthday_month"));
		Select stMonth = new Select(dropdownMonth);
		//By value
		stMonth.selectByValue("5");
		WebElement dropdownyear = driver.findElement(By.id("year"));
		Select styear = new Select(dropdownyear);
		//by visible text
		styear.selectByVisibleText("2000");
		Thread.sleep(2000);
		
		WebElement radioButton = driver.findElement(By.name("sex"));
		radioButton.click();
		//Is selected method
		System.out.println("Isselected validation =  " + radioButton.isSelected());
		
		
	}
	

}
