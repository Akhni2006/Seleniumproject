package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Banu\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mycareersfuture.gov.sg/");
		driver.manage().window().maximize();
		
		//findElements using tagname
	   List<WebElement> links = driver.findElements(By.tagName("a"));
	 System.out.println(links.size());
	 
	 //using gettext by xpath 
	WebElement career = driver.findElement(By.xpath("//*[@id=\"main-nav-child\"]/div[3]/div/div[1]/a[2]"));
	System.out.println(career.getText());
	
	//sendkey
	WebElement search = driver.findElement(By.className("react-autosuggest__input"));
	search.sendKeys("software tester");
	
	//clear method
	search.clear();
	
	
		
	
	
	

		
		
	}

}
