package PackageSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingAllLocatorsTestLeaf {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
		//Login credentials
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		//click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//click on Leads button
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		//Click on create Lead Button a[href="/crmsfa/control/createLeadForm"]
		driver.findElement(By.cssSelector("a[href='/crmsfa/control/createLeadForm']")).click();
		//driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']")).click();

		// 7. Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("invoki analytics");

		//8. Enter FirstName using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("invoki");

		//9. Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("perums"); 

		//10. Select value as Employee in Source Using SelectbyVisible text
		WebElement listSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		listSource.click();
		Select selectSource = new Select(listSource); 
		selectSource.selectByVisibleText("Employee");

		//11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
		WebElement element_marketingCompaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		element_marketingCompaign.click();
		Select select_marketingCompaign = new Select(element_marketingCompaign);
		//new WebDriverWait(driver,3000).until(ExpectedConditions.elementToBeSelected(element_marketingCompaign));
		select_marketingCompaign.selectByValue("9001");

		//12. Select value as Telecommunications from the bottom (size-2) in Industry using SelectByIndex
		WebElement element_industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		element_industry.click();
		Select select_industry = new Select(element_industry);
		List<WebElement> elementListIndustry = select_industry.getOptions();
		int size_industry = elementListIndustry.size();
		select_industry.selectByIndex(size_industry - 2);

		//13. Select value as Corporation in OwnerShip field Using SelectbyIndex
		WebElement element_ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		element_ownership.click();
		Select select_ownership = new Select(element_ownership);
		select_ownership.selectByValue("OWN_CCORP");

		// 14. Select value as India in Country Field Using SelectbyVisibletext
		WebElement element_country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", element_country);
		element_country.click();
		Select select_country = new Select(element_country);
		select_country.selectByVisibleText("India");

		//15. Click on create Lead Button Using name Locator
		driver.findElement(By.name("submitButton")).click();

		// 16. Get the Title of the resulting Page*/
		System.out.println(driver.getTitle());

		driver.close();
	}

}
