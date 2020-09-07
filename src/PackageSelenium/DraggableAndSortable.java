package PackageSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableAndSortable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.get("https://jqueryui.com/sortable/");
		wd.manage().deleteAllCookies();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);

		wd.switchTo().frame(wd.findElement(By.className("demo-frame")));
		List<WebElement> listItems = wd.findElements(By.cssSelector("#sortable>li"));
		WebElement sourceElement = listItems.get(2);
		WebElement targetElement = listItems.get(4);
		Actions onWebDriver = new Actions(wd);
		onWebDriver.click(sourceElement).clickAndHold().moveByOffset(0, 120).release().build().perform();
		Thread.sleep(3000);
		onWebDriver.click(targetElement).clickAndHold().moveToElement(sourceElement).moveByOffset(0, 150).release().build().perform();
		Thread.sleep(3000);
		wd.quit();
	}

}
