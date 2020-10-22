package PackageSelenium;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchTextboxes{
	public SwitchTextboxes() throws IOException {
		super();
	}
	WebDriver driver;
	PropertyConfiguration pc = new PropertyConfiguration();

	@BeforeMethod
	public void setUp(){
		System.setProperty(pc.getGeckoDriver(), pc.getGeckoDriverPath());
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(pc.getFormsSet());
	}
	@Test
	public void traverseInputBoxes() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700);");
		Thread.sleep(2000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='fs_embed']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your email address']"));
		email.sendKeys("mvpvenkatesh@gmail.com");
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='Your first name']"));
		firstname.click();
		firstname.sendKeys("venkateshperumal");
		Thread.sleep(3000);
		String placeHolder = firstname.getAttribute("placeholder");
		try{
			Assert.assertEquals(placeHolder, "Your first name");
			Thread.sleep(3000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
