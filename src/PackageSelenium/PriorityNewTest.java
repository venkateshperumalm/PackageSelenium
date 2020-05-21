package PackageSelenium;

import org.testng.annotations.Test;

public class PriorityNewTest {
	@Test(priority=1)
	public void checkAlert(){
		System.out.println("4 alert");}

	@Test(priority=2)
	public void checkPopup(){
		System.out.println("5 popup");}

	@Test(priority=3)
	public void checkMessage(){
		System.out.println("6 messaege");}}

