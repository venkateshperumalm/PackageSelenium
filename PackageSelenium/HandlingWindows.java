package PackageSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlingWindows {

	WebDriver wDriver;

	@BeforeTest
	public void setUp() throws Exception {
		PropertyConfiguration proConfig = new PropertyConfiguration();

		System.setProperty(proConfig.getGeckoDriver(), proConfig.getGeckoDriverPath());
		wDriver = new FirefoxDriver();
		wDriver.manage().window().maximize();
		wDriver.manage().deleteAllCookies();
		wDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		wDriver.get(proConfig.getDotDashUrl());
	}
	@Test
	public void switchWindow() throws InterruptedException {
		wDriver.findElement(By.cssSelector(".logo-holder")).click();

		Set<String> windowHandles = wDriver.getWindowHandles();
		Iterator<String> windowIt = windowHandles.iterator();
		//To display all window handles of the current page
		System.out.println("All new windows: ");
		while(windowIt.hasNext()){
			System.out.println(windowIt.next());
		}
		String secWindow;
		String firstWindow = wDriver.getWindowHandle();
		windowHandles.remove(firstWindow);
		secWindow = windowHandles.iterator().next();
		if(secWindow != firstWindow){
			//String secondWindow= secWindow;
			wDriver.switchTo().window(secWindow);
			Thread.sleep(3000);
			System.out.println("Child window details: " + wDriver.getTitle() + "\nURL: " + wDriver.getCurrentUrl());
		}
	}
	@AfterTest
	public void tearDown(){
		System.out.println("\u134C");
		wDriver.quit();
	}
}

