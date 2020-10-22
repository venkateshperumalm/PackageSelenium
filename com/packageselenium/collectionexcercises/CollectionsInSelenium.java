package com.packageselenium.collectionexcercises;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CollectionsInSelenium {
	public static WebDriver driver;

	public static void setUp(){
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void useList(){
		List<WebElement> tableContents = driver.findElements(By.xpath("//*[contains(text(),'IndusInd Bank')]/parent::td/ancestor::tr/preceding-sibling::tr"));
		Iterator<WebElement> itOnTable = tableContents.iterator();
		String value = "" ;
		System.out.println("Fetched table contents: ");
		while(itOnTable.hasNext()){
			WebElement element = itOnTable.next();
			value = element.getText();
			System.out.println(value);
		}
	}
	public static void quitBrowser() {
		driver.quit();		
	}

	public static void main(String args[]){
		setUp();
		useList();
		quitBrowser();
	}
}
