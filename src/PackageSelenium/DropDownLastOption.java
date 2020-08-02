package PackageSelenium;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownLastOption {

	WebDriver wDriver;
	@BeforeTest
	public void setUp() throws Exception {
		PropertyConfiguration proConfig = new PropertyConfiguration();

		System.setProperty(proConfig.getGeckoDriver(), proConfig.getGeckoDriverPath());
		wDriver = new FirefoxDriver();
		wDriver.manage().window().maximize();
		wDriver.manage().deleteAllCookies();
		wDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		wDriver.get(proConfig.getSeleniumeasyUrl());
	}
	@Test
	public void selectLastOption() throws InterruptedException {
		WebElement	options = wDriver.findElement(By.id("select-demo"));
		options.click();
		Thread.sleep(3000);
		Select dropList = new Select(options);
		List<WebElement> we = dropList.getOptions();
		int sizeOptions = we.size();
		System.out.println("Options are: ");
		for(int i = 0; i < sizeOptions; i++){
			System.out.println(we.get(i).getText());
		}
		dropList.selectByIndex(sizeOptions-1);
	}
	@AfterTest
	public void tearDown(){
		wDriver.quit();
	}
}
