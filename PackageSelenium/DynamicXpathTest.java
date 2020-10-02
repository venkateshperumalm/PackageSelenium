package PackageSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DynamicXpathTest {
	@Test
	public void locateDynamicXpath() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver wDriver = new FirefoxDriver();
		Actions a = new Actions(wDriver);
		wDriver.manage().deleteAllCookies();
		wDriver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		wDriver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> tbCols = wDriver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"));

		for(WebElement columnNames : tbCols){
			System.out.println(columnNames);
		}
		wDriver.close();
	}
}
