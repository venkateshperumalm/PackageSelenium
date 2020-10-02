package PackageSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ActionDragAndDrop {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement button5000From = driver.findElement(By.xpath("//*[@id='fourth']"));

		WebElement button5000To = driver.findElement(By.xpath("//*[@id='amt7']/li"));////*[@id='amt7']/li

		Actions a= new Actions(driver);
		a.dragAndDrop(button5000From,button5000To).perform();

		String inner = driver.findElement(By.xpath("//*[@id='t7']")).getText();
		try{
			Assert.assertEquals(inner,5000);
		}catch(Exception e){
			System.out.println("equals");
		}
		driver.quit();
	}

}
