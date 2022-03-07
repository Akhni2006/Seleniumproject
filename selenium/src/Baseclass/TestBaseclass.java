package Baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class TestBaseclass {

	public static WebDriver driver;
	public static WebDriver setup(String browserName) {
	if (browserName.equalsIgnoreCase("Gecko")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Banu\\eclipse-workspace\\selenium\\Drivers\\geckodriver.exe");
		
		//Object Creation for Geckodriver class
		driver = new FirefoxDriver();
		
		//returning initialized driver
		return driver;
	
	}else if(browserName.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Banu\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		
		//object creation for edgedriver class
		driver = new ChromeDriver();
		
		//returning initialized driver
		return driver;
	}
	 else
		throw new NullPointerException("Invalid Browser");
	}

public static void getUrl(String URL) {
	

	
	//opening URL
     driver.get(URL);
      
}  
	public static void navigate(WebDriver driver,String action) {
		
		if(action.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
				
		}else if(action.equalsIgnoreCase("backward")) {
			driver.navigate().back();
		}else if(action.equalsIgnoreCase("Refresh")) {
			driver.navigate().refresh();
		}else if(action.equalsIgnoreCase("Maximize")) {
			driver.manage().window().maximize();	
			
		}else {
			System.out.println("please enter valid navigate function like,Forward,Backward,Refresh");
		}
}

public static void getScreenShot(String srcShotPath) throws InterruptedException{

	String path = srcShotPath + Math.random()+".png";
	System.out.println(path);
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File scrSource = ts.getScreenshotAs(OutputType.FILE);
	
	try {
		File scrDestn = new File(path);
		Files.copy(scrSource, scrDestn);
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("Exception  occured while handling the file path");
		
	} finally {
		System.out.println("Screenshoted and saved in the provided path");
	}
}
		
		
public static void Sendkey(WebElement element,String  value) {
	element.sendKeys(value);
	element.getText();
}
	public static void conceptc(WebElement element) {
		element.click();
	}
	public static void currentUrl() {
		try {
			driver.getCurrentUrl();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		}
	public static void remv(WebElement element) {
		try {
			element.clear();
		} catch(Exception e) {
		e.printStackTrace();
		}
	}
	public static void close() {
		try {
			driver.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void quit() {
		try {
			driver.quit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void getTitle() {
		try {
		driver.getTitle();
	} catch(Exception e) {
		e.printStackTrace();
	}
}
public static void enabled(WebElement element) {
	try {
		element.isEnabled();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
public static void displayed(WebElement element) {
	try {
		element.isDisplayed();
	} catch(Exception e) {
		e.printStackTrace();
		
	}
}
public static void selected(WebElement element) {
	try {
		element.isSelected();
	} catch(Exception e) {
		e.printStackTrace();
		
	}
}
public static void movetoelement(WebElement element) {
	Actions ac = new Actions(driver);
	ac.moveToElement(element).perform();
	}
public static void contextclick(WebElement element) {
	Actions ac = new Actions(driver);
	ac.contextClick().perform();
}
public static void dragAnddrop(WebElement element) {
	Actions ac = new Actions(driver);
	ac.dragAndDrop(element, element).perform();
}
public static void robotclass(WebElement element) throws Throwable{
	Robot rc = new Robot();
	rc.keyPress(KeyEvent.VK_DOWN);
	rc.keyPress(KeyEvent.VK_ENTER);
	rc.keyRelease(KeyEvent.VK_DOWN);	
}
public static void selectclass1(WebElement element,String value) {
	Select sc = new Select(element);
	sc.selectByIndex(0);
}
public static void selectclass2(WebElement element,String value) {
	Select sc = new Select(element);
	sc.selectByValue(value);
}
public static void selectclass3(WebElement element,String value) {
	Select sc = new Select(element);
	sc.selectByVisibleText(value);
}
public void frame(WebElement element) {
	driver.switchTo().frame(0);
}
}





