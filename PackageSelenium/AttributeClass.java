package PackageSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AttributeClass {
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().deleteAllCookies();
		Set<Cookie> cookiesSet  = driver.manage().getCookies();
		for(Cookie a : cookiesSet){
			System.out.println(a);
		}
		//driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(9000, TimeUnit.MILLISECONDS);
		driver.get("https://www.slideshare.net/KuldeepPawar5/realtime-selenium-interview-questions");
	}
	@Test
	public void getAttribute(){
		//WebDriverWait wait = new WebDriverWait(driver, 3000);
		WebElement loginButton = driver.findElement(By.id("login"));
		//wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		String we = loginButton.getAttribute("class");
		System.out.println(we);
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
