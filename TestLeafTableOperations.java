import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLeafTableOperations {

	public static void main(String args[]){
		//table[@id='table_id']//th
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.get("http://leafground.com/pages/table.html");
		wd.manage().deleteAllCookies();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		List<WebElement> table_columns = wd.findElements(By.xpath("//table[@id='table_id']//th"));
		int sizeOfColumns = table_columns.size();
		System.out.println(sizeOfColumns);

		List<WebElement> table_rows = wd.findElements(By.xpath("//table[@id='table_id']//tr"));
		for(WebElement rowVal : table_rows){
			System.out.println(rowVal.getText());
		}
		int rows_size = table_rows.size();
		System.out.println(rows_size-1);

		//Get the progress value of 'Learn to interact with Elements'
		WebElement inprogress_value = wd.findElement(By.xpath("//table[@id='table_id']/tbody/child::tr[3]/child::td[2]"));
		//WebElement inprogress_value = wd.findElement(By.cssSelector("#table_id > tbody > tr:nth-child(3) > td:nth-child(2)"));
		System.out.println(inprogress_value.getText());

		//Check the vital task for the least completed progress.
		//table[@id='table_id']/tbody/tr[5]/child::td[2]
		String partOne = "//table[@id='table_id']/tbody/tr[";
		String partTwo = "]/child::td[2]";
		List<String> progressSet = new ArrayList<String>();
		String progress;
		for(int index = 2;index <= rows_size;index++){
			progress= wd.findElement(By.xpath(partOne+index+partTwo)).getText();
			progressSet.add(progress);
		}
		System.out.println("List values:");
		for(String s : progressSet){
			System.out.println(s);
		}
		System.out.println("Min progress:" + Collections.max(progressSet));
		wd.quit();
	}

}
