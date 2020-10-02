package PackageSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EasyDragAndDrop {

	WebDriver wDriver;		
	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		wDriver = new FirefoxDriver();
		wDriver.manage().window().maximize();
		wDriver.manage().deleteAllCookies();
		wDriver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		wDriver.get("http://demo.guru99.com/test/drag_drop.html");					
	}

	@Test		
	public void DragnDrop()					
	{		

		//Element which needs to drag.    		
		WebElement From=wDriver.findElement(By.xpath("//*[@id='credit2']/a"));	

		//Element on which need to drop.		
		WebElement To=wDriver.findElement(By.xpath("//*[@id='bank']/li"));					

		//Using Action class for drag and drop.		
		Actions act=new Actions(wDriver);					

		//Dragged and dropped.		
		act.dragAndDrop(From, To).build().perform();		
	}	
	@AfterTest
	public void tearDown(){
		wDriver.quit();
	}
}
