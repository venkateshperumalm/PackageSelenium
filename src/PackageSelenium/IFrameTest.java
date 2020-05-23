package PackageSelenium;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFrameTest {
	WebDriver wDriver;

	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		wDriver = new FirefoxDriver();
		wDriver.manage().window().maximize();
		wDriver.manage().deleteAllCookies();
		wDriver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		wDriver.get("https://www.dotdash.com/");
	}

	@Test
	public void testIframe() throws InterruptedException, IOException {
		List<WebElement> iFrames = wDriver.findElements(By.className("frame"));
		int framesCount = iFrames.size();
		System.out.println("Total frames in current page: " + framesCount);
		Thread.sleep(3000);

		String fastComXpath = "//a[@href = 'https://www.fastcompany.com/90430104/how-dotdash-formerly-about-com-took-over-the-internet']";
		WebElement fastCompany = wDriver.findElement(By.xpath(fastComXpath));
		JavascriptExecutor jse =  (JavascriptExecutor)wDriver;
		jse.executeScript("arguments[0].scrollIntoView(true);", fastCompany);
		Thread.sleep(3000);

		System.out.println("InnerText of frame 1: " + iFrames.get(1).getText());
		iFrames.get(1).click();
		Thread.sleep(3000);

		String parentWinHandle = wDriver.getWindowHandle();

		Set<String> winHandles = wDriver.getWindowHandles();
		// Loop through all handles
		for(String handle: winHandles){
			if(!handle.equals(parentWinHandle)){
				wDriver.switchTo().window(handle);
				Thread.sleep(2000);
				System.out.println("Title of the new child window: " +
						wDriver.getTitle());
				IframeBaseClass.takeScreenShot(wDriver, "testIframe");
				Thread.sleep(3000);
				System.out.println("Closing the new child window...");
				wDriver.close();
			}
		}
		Thread.sleep(3000);

		//below 6 lines does not work out to switch to child window
		//		String childWindow = wDriver.getWindowHandle();
		//		wDriver.switchTo().window(childWindow);
		//		Thread.sleep(3000);

		//		System.out.println("Child page URL: " + wDriver.getCurrentUrl());
		//		System.out.println("child Page title: " +wDriver.getTitle());
		//		Thread.sleep(3000);

		// Switching the control back to parent window
		wDriver.switchTo().window(parentWinHandle);
		System.out.println("DotDash page title: " +wDriver.getTitle() + "DotDash URL: " + wDriver.getCurrentUrl());
	}
	@AfterTest
	public void tearDown(){
		wDriver.quit();
	}
}
