package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Baseclass.TestBaseclass;

public class SeleniumProject {
	public static WebDriver driver;

	public static void main(String[] args)throws Throwable {
		driver = TestBaseclass.setup("Gecko");
		TestBaseclass.navigate(driver, "Maximize");
		driver.get("http://testautomationpractice.blogspot.com/");
		String window1 = driver.getWindowHandle();
		driver.manage().window().maximize();
	
		//search a topic
		driver.findElement(By.className("wikipedia-search-input")).sendKeys("color");
		driver.findElement(By.className("wikipedia-search-button")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/aside/div/div[1]/div[1]/div[2]/div[1]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().window(window1);
		Thread.sleep(3000);
		
		//double click
		Actions ac = new Actions(driver);
		WebElement dc = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[1]/div[1]/button"));
		ac.doubleClick(dc).perform();
		driver.findElement(By.id("field1")).clear();
		TestBaseclass.getScreenShot("C:\\Users\\Banu\\eclipse-workspace\\selenium\\ScreenShots");
				
		// drag and drop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).perform();
		WebElement dAndd = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		System.out.println(dAndd.getText());
		String actualText1 = "Dropped!";
		String expectedText1 = dAndd.getText();
		System.out.println("dAndd Validation =" +actualText1.equals(expectedText1));
	
	   //alert handling
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement alert = driver.findElement(By.id("demo"));
        System.out.println(alert.getText());
        String actualText = "You pressed OK!";
        String expectedText = alert.getText();
        System.out.println("Validation" + actualText.equals(expectedText));
       
       //date picker
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ui-datepicker-div")).click();
		
		//drag and drop image
		WebElement drag1 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[3]/div[1]/div/ul/li[1]/h5"));
		WebElement drop1 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[3]/div[1]/div/div/h4"));
		drop1.click();
		ac.dragAndDrop( drag1,drop1).perform();
		Thread.sleep(2000);
	    WebElement drag2 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[3]/div[1]/div/ul/li/h5"));
		WebElement drop2 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[3]/div[1]/div/div/h4"));
		drop2.click();
		ac.dragAndDrop(drag2, drop2).perform();
		
	   //dropdown
		WebElement dd1 = driver.findElement(By.tagName("select"));
		Select st1 = new Select(dd1);
		st1.selectByVisibleText("Faster");
		WebElement dd2 = driver.findElement(By.xpath("//*[@id=\"files\"]"));
		Select st2 = new Select(dd2);
		st2.selectByVisibleText("DOC file");
		WebElement dd3 = driver.findElement(By.id("number"));
		Select st3 = new Select(dd3);
		st3.selectByVisibleText("5");
		WebElement dd4 = driver.findElement(By.id("products"));
		Select st4 = new Select(dd4);
		st4.selectByVisibleText("Bing");
		WebElement dd5 = driver.findElement(By.id("animals"));
		Select st5 = new Select(dd5);
		st5.selectByVisibleText("Big Baby Cat");
		Thread.sleep(2000);
		
		//form filling
		driver.switchTo().frame("frame-one1434677811");
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Kayal");
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Kannan");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("9234523123");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Chennai");
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("abc@604307");
		driver.findElement(By.xpath("/html/body/form/div[2]/div[15]/table/tbody/tr[2]/td/label")).click();
		driver.findElement(By.xpath("/html/body/form/div[2]/div[17]/table/tbody/tr[2]/td/label")).click();
		driver.findElement(By.xpath("/html/body/form/div[2]/div[17]/table/tbody/tr[3]/td/label")).click();
		WebElement AT = driver.findElement(By.id("RESULT_RadioButton-9"));
		Select st6 = new Select(AT);
		st6.selectByIndex(2);
		Thread.sleep(3000);
		
		
		
		
		
	}

}
