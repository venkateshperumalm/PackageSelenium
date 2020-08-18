package PackageSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTableOperations {

	WebDriver driver;

	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
	}

	@Test
	public void manipulateTable() throws InterruptedException {
		
		
		//*[@id="example"]/tbody/tr[1]/td[3]
		//*[@id="example"]/tbody/tr[4]/td[3]
		
//		List<WebElement> colVal = driver.findElements(By.xpath("//table[@id = 'example']//thead//th[starts-with(@class,'sorting')]"));
//		List<WebElement> rowVal = driver.findElements(By.xpath("//table[@id='example']//td"));
//		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("td.select-checkbox"));
//		int rowSize = rowVal.size();
//		int colSize = colVal.size();
//		int boxSize = checkBoxes.size();
//		for(int i=0;i<colSize;i++){
//			for(int ij=1;ij<rowSize;ij++){
//				if(colVal.get(i).getText().equals("Position") && rowVal.get(ij).getText().equals("Software Engineer")){
//					checkBoxes.get(ij).click();
//					System.out.println("Checked");
//				}
//			}
//		}
//		Thread.sleep(4000);
//		System.out.println("Finally!");
		
		String b_Xpath = "//*[@id='example']/tbody/tr[";
		String a_Xpath = "]/td[3]";
		Select a = new Select(driver.findElement(By.xpath("//*[@id='example_length']/label/select")));
		a.selectByIndex(3);
		for(int i=1;i<57;i++){
			String name = driver.findElement(By.xpath(b_Xpath + i + a_Xpath)).getText();
			if(name.contains("Software Engineer")){
				driver.findElement(By.xpath("//*[@id='example']/tbody/tr[" + i + "]/td[1]")).click();
			}
		}
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
