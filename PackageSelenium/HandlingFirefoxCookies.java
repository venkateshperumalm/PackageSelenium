package PackageSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingFirefoxCookies {
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.MILLISECONDS);
		driver.get("about:preferences#privacy");
	}
	@Test
	public void clearCookies() throws InterruptedException{
		WebElement clearData = driver.findElement(By.id("clearSiteDataButton"));
		JavascriptExecutor jExecutor =(JavascriptExecutor)driver; 
		jExecutor.executeScript("arguments[0].scrollIntoView();", clearData);
		clearData.click();
		Thread.sleep(5000);
		driver.switchTo().activeElement();
		WebElement clearButton = driver.findElement(By.xpath("//*[@id='clearButton']"));
		clearButton.click();
		Thread.sleep(5000);
		driver.switchTo().activeElement().click();
		Thread.sleep(8000);
		System.out.println("Caches are cleared");
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
