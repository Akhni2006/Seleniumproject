package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Baseclass.TestBaseclass;

public class SelectClass {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = TestBaseclass.setup("Gecko");
		TestBaseclass.getUrl("https://ultimateqa.com/simple-html-elements-for-automation/");
		TestBaseclass.navigate(driver, "Maximize");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"post-909\"]/div/div[1]/div/div[3]/div/div[1]/div[9]/div/div/div/select"));
		
		//object creation for select Class
		Select st = new Select(dropdown);
       
		//By value
		st.selectByValue("opel");
		
		
		
		
	}

}
