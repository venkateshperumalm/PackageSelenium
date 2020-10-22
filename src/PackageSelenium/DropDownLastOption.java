package PackageSelenium;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
<<<<<<< HEAD
import org.openqa.selenium.JavascriptExecutor;
=======
>>>>>>> eaab35223ddc0b337baee40bd04a8ee4b6ca60c8
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
<<<<<<< HEAD
		wDriver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
=======
		wDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
>>>>>>> eaab35223ddc0b337baee40bd04a8ee4b6ca60c8
		wDriver.get(proConfig.getSeleniumeasyUrl());
	}
	@Test
	public void selectLastOption() throws InterruptedException {
		WebElement	options = wDriver.findElement(By.id("select-demo"));
		options.click();
<<<<<<< HEAD
		JavascriptExecutor jse = (JavascriptExecutor)wDriver;
		jse.executeScript("arguments[0].scrollIntoView(true)", options);
=======
		Thread.sleep(3000);
>>>>>>> eaab35223ddc0b337baee40bd04a8ee4b6ca60c8
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
