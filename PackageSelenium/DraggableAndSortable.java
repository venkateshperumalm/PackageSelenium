package PackageSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DraggableAndSortable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.get("https://jqueryui.com/sortable/");
		wd.manage().deleteAllCookies();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);

		//		WebElement datepicker_element = wd.findElement(By.xpath("//a[@href='https://jqueryui.com/datepicker/']"));

		wd.switchTo().frame(wd.findElement(By.className("demo-frame")));
		List<WebElement> listItems = wd.findElements(By.cssSelector("#sortable>li"));
		//		JavascriptExecutor scrollToFrame = (JavascriptExecutor)wd;
		//		scrollToFrame.executeScript("arguments[0].scrollIntoView();",datepicker_element);
		WebElement sourceElement = listItems.get(0);
		WebElement targetElement = listItems.get(3);
		Actions onWebDriver = new Actions(wd);
		//		onWebDriver.click(sourceElement).clickAndHold().moveByOffset(0, 120).release().build().perform();
		//		Thread.sleep(3000);
		onWebDriver.click(sourceElement).clickAndHold().moveToElement(targetElement).moveByOffset(0, 90).release().build().perform();
		Thread.sleep(3000);
		new WebDriverWait(wd,3000).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.id("smids")));
		wd.quit();
	}

}
