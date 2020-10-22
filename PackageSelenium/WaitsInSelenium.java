package PackageSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitsInSelenium {
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws IOException{
		PropertyConfiguration pc = new PropertyConfiguration();
		System.setProperty(pc.getGeckoDriver(), pc.getGeckoDriverPath());
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(pc.getGmailUrl());
	}

	@Test
	public void waitTestForGmailCredentials(){
		WebDriverWait wait = new WebDriverWait(driver,30);
		By username = By.xpath("//a[@href='https://accounts.google.com/AccountChooser?service=mail&continue=https://mail.google.com/mail/']");
		wait.until(ExpectedConditions.elementToBeClickable(username));	
		By password = By.linkText("Enter your password");
		driver.findElement(username).click();
		driver.findElement(username).sendKeys("mvpvenki@gmail.com");

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(password));
		driver.findElement(password).click();
	}

	public void tearDown(){
		driver.quit();
	}
}
