package PackageSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
	}
	@Test
	public void handleAlert() {
		driver.findElement(By.xpath("//input[@name ='cusid']")).sendKeys("63779");
		//new WebDriverWait(driver, 3000).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name ='submit']")));
		driver.findElement(By.xpath("//input[@name ='submit']")).click();
		//new WebDriverWait(driver, 3000).until(ExpectedConditions.alertIsPresent());
		Alert popup = driver.switchTo().alert();
		Assert.assertEquals("Do you really want to delete this Customer?", popup.getText(),"Not the given message");
		System.out.println("Actual message is :" + popup.getText());
		popup.accept();
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
