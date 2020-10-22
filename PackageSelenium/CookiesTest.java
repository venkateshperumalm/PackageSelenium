package PackageSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CookiesTest {
	WebDriver wDriver;

	@BeforeTest
	public void setUp() throws Exception {
		PropertyConfiguration proConfig = new PropertyConfiguration();

		System.setProperty(proConfig.getGeckoDriver(), proConfig.getGeckoDriverPath());
		wDriver = new FirefoxDriver();
		wDriver.manage().window().maximize();
		wDriver.manage().deleteAllCookies();
		wDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		String URL="http://www.flipkart.com";
		wDriver.get(URL);
	}
	@Test
	public void deleteCookieNamed() {
		wDriver.manage().deleteCookieNamed("__utmb");
		System.out.println("Cookie is deleted by name");
	}
	@AfterTest
	public void tearDown(){
		wDriver.quit();
	}
}
