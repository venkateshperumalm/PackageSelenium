package PackageSelenium;

import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSearchResults {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://know.creditsights.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		WebElement searchElement = driver.findElement(By.xpath("//span[@class='icon-salient-search']"));
		Thread.sleep(3000);
		searchElement.click();
		WebElement searchInput = driver.findElement(By.xpath("//*[@id='s']"));
		searchInput.sendKeys("China",Keys.ENTER);
		Thread.sleep(3000);

		List<WebElement> listOfResults = driver.findElements(By.xpath("//article[@class='result']//div//a"));
		int sizeOfResults = listOfResults.size();
		int countOfChina = 0;
		System.out.println(sizeOfResults);
		for(WebElement e : listOfResults){
			System.out.println(e.getAttribute("aria-label"));
			if(e.getAttribute("aria-label").contains("china")){
				countOfChina++;
			}
		}
		if(sizeOfResults == countOfChina){
			System.out.println("passed");
		}else
			System.out.println("failed");
		driver.quit();
	}

}
