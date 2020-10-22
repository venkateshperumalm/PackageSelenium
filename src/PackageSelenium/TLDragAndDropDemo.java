package PackageSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TLDragAndDropDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.get("https://jqueryui.com/droppable/");
		wd.manage().deleteAllCookies();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		wd.switchTo().frame(wd.findElement(By.className("demo-frame")));
		WebElement elementToBeMoved = wd.findElement(By.xpath("//div[@id='draggable']"));
		Actions sourceToTarget = new Actions(wd);
		Thread.sleep(3000);
		sourceToTarget.dragAndDropBy(elementToBeMoved, 150, 30).build().perform();
		Thread.sleep(3000);
		String drop_text= wd.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		Assert.assertEquals(drop_text, "Dropped!","Success-dropped");
		wd.quit();
	}
}
