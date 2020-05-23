public class FrameHandling {
	@Test
	public void locateDynamicXpath() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
		WebDriver wDriver = new FirefoxDriver();
		Actions a = new Actions(wDriver);
		wDriver.manage().deleteAllCookies();
		wDriver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		wDriver.get("http://demo.guru99.com/test/web-table-element.php");