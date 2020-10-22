package PackageSelenium;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HashMapSelenium {
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		PropertyConfiguration config = new PropertyConfiguration();

		//HashMap is used in Role based applications. For an ecart application, if it has different level of user hierarchy
		//there is a scenario to test whether ecart login is working fine for all level of user hierarchy
		System.setProperty(config.getGeckoDriver(), config.getGeckoDriverPath());
		driver = new FirefoxDriver();
		driver.get(config.getF3FrameworkUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(getUserName());
		driver.findElement(By.id("password")).sendKeys(getPassword());
		driver.close();
	}
	public static HashMap<String,String> getCredentials(){
		HashMap<String,String> credMap = new HashMap<String,String>();
		credMap.put("manager", "venkat:Test@123");
		credMap.put("admin", "venkatesh:Test@12345");
		credMap.put("seller", "varunvenkat:Test$$$");
		credMap.put("customer", "venkatYem:ecart@123");
		credMap.put("deliveryBoy", "venkatesan:del@123");

		return credMap;
	}
	public static String getUserName(){
		//String.split(":") will return String[],by giving 0th index-username,1stIndex-password
		String userName = getCredentials().get("manager").split(":")[0];
		return userName;
	}
	public static String getPassword(){
		String password = getCredentials().get("manager").split(":")[1];
		return password;
	}
}