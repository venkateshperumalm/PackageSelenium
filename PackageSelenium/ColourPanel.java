package PackageSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ColourPanel {

	@Test
	public void setRgbColour() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait elementWait = new WebDriverWait(driver, 3);
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://a.testaddressbook.com/sign_in");

		driver.findElement(By.cssSelector("input[name='session[email]']")).sendKeys("venkatesh95@gmail.com");
		driver.findElement(By.cssSelector("input[name='session[password]']")).sendKeys("passw0rd");
		driver.findElement(By.cssSelector("input[name='commit']")).click();
		elementWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Addresses')]")));

		driver.findElement(By.xpath("//a[contains(text(), 'Addresses')]")).click();
		elementWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'New Address')]")));

		driver.findElement(By.xpath("//a[contains(text(), 'New Address')]")).click();
		elementWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='address[first_name]']")));

		driver.findElement(By.xpath("//input[@name='address[first_name]']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='address[last_name]']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@name='address[address1]']")).sendKeys("street1");
		driver.findElement(By.xpath("//input[@name='address[address2]']")).sendKeys("street1a");
		driver.findElement(By.xpath("//input[@name='address[city]']")).sendKeys("city1");
		WebElement st = driver.findElement(By.xpath("//select[@name='address[state]']"));

		Select state = new Select(st);
		state.selectByValue("IN");

		driver.findElement(By.xpath("//input[@id='address_country_canada']")).click();
		elementWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='address[color]']")));

		driver.findElement(By.xpath("//input[@name='address[color]']"));
		String myColour = "#35ccff";

		jsExecutor.executeScript("document.getElementById('address_color').value=\'"+myColour+"\'");
		Thread.sleep(3000);
		
		
		WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
//		jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", file);
		file.sendKeys("D:\\6.1plus\\WhatsApp\\Media\\WhatsApp Images\\Sent\\IMG-20181229-WA0005.jpg");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
