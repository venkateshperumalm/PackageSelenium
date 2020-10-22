package PackageSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadUsingSelenium {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		PropertyConfiguration pc = new PropertyConfiguration();
		System.setProperty(pc.getGeckoDriver(), pc.getGeckoDriverPath());
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(pc.getGmailUrl());

		// Launch the Postmyimage Website
		driver.get("http://www.postmyimage.com/");

		// Find the upload textbox
		WebElement upload = driver.findElement(By.className("input2"));

		// Enter the file path onto the file-selection input field
		upload.sendKeys("C:\\DemoImage\\Tulips.jpg");

		// Click on TOS Checkbox
		driver.findElement(By.name("tos")).click();

		// Click on Submit Button
		driver.findElement(By.id("submit1")).click();

		// Wait
		Thread.sleep(8000);

		// Store Uploaded image Path
		String UploadImage = driver.findElement(By.name("url1[]")).getText();

		// Compare
		if (UploadImage.contains("Tulips")) {
			System.out.println("Image Uploaded Successfully");
		} else {
			System.out.println("Image Upload Failed");
		}

		// Close the browser
		driver.quit();
	}
}