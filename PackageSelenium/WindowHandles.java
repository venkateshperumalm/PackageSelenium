package PackageSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowHandles {

	@Test
	public void getWindows() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver wDriver = new ChromeDriver();
		wDriver.get("http://demo.automationtesting.in/Windows.html");
		wDriver.findElement(By.partialLinkText("click")).click();
		Set<String> allWindows = wDriver.getWindowHandles();
		Iterator<String> a = allWindows.iterator();
		String parent = a.next();
		String child = a.next();

		wDriver.switchTo().window(child);
		Thread.sleep(3000);
		Assert.assertEquals(wDriver.getTitle(), "Sakinalium | Home");
		System.out.println("Child window title" +wDriver.getTitle());
		wDriver.switchTo().window(parent);

		Thread.sleep(3000);
		System.out.println("Parent window title" +wDriver.getTitle());
		wDriver.quit();
	}

}
