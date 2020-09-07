package PackageSelenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class IframeBaseClass {

	public static void takeScreenShot(WebDriver driver, String testcaseName ) throws IOException{
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd_hh.mm.ss").format(new Date());
		final String outputPath = "C:\\Users\\Venkat Yem\\workspace\\ProjectSelenium\\Others\\";
		File destFile = new File(outputPath + testcaseName + "_" + timeStamp + ".png");
		TakesScreenshot testSS = ((TakesScreenshot)driver);
		File srcFile = testSS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, destFile);

	}
}
