package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AlertHandling {

	public static void main(String[] args) throws Throwable{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Banu\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

		//clicking on WebElement - confirmation alert
		
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		
		//switching driver scope into the alert
		driver.switchTo().alert().accept();
		
		//GetTextMethod
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"confirmResult\"]"));
		System.out.println(confirm.getText());
		
		String actualText = "You selected Ok";
		String expectedText = confirm.getText();
		System.out.println("Validation" + actualText.equals(expectedText));
		
		//clicking on WebElement - prompt alert
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		 
		// passing input over alert
		 driver.switchTo().alert().sendKeys("Akhshay");
		 
		 Thread.sleep(3000);
		 driver.switchTo().alert().accept();
		 
		WebElement prompt =  driver.findElement(By.id("promptResult"));
		 System.out.println(prompt.getText());
		 
		 
		 //Assert equals
		 String expectedName = "You entered Akhshay";
		 Assert.assertEquals(expectedName, "You entered Akhshay");
		 
		 
		
		
		
		
	}

}
