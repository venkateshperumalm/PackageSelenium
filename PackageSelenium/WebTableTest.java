package PackageSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/WebTable.html");
	}

	@Test
	public void manipulateTable() {
		List<WebElement> colVal = driver.findElements(By.xpath("//span[@class = 'ui-grid-header-cell-label ng-binding']"));
		List<WebElement> rowVal = driver.findElements(By.xpath("//div[@class = 'ui-grid-canvas']/div"));
		int rowSize = rowVal.size();
		int colSize = colVal.size();
		for(int i=0;i<colSize;i++){
			System.out.println(colVal.get(i).getText());
		}
		for(int ij=1;ij<rowSize;ij++){
			System.out.println(rowVal.get(ij).getText());
		}
		System.out.println("Success");
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
