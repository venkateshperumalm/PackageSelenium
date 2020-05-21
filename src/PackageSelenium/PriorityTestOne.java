package PackageSelenium;

import org.testng.annotations.Test;

public class PriorityTestOne {
	@Test(priority=1)
	public void checkTitleTest(){
		System.out.println("1 titleOne");}

	@Test(priority=2)
	public void checkTitleName(){
		System.out.println("2 titletwo");}

	@Test(priority=3)
	public void checkTitleAttribute(){
		System.out.println("3 titlethree");}}
