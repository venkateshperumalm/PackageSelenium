package PackageSelenium;


public class ClassOne implements InterfaceTwo {

	@Override
	public void getTitle(int a) {
		a=10;
		System.out.println("title " +a);		
	}

	@Override
	public void getName() {
		System.out.println("name");
	}

	@Override
	public void getDouble() {
		System.out.println("double");
	}


}
