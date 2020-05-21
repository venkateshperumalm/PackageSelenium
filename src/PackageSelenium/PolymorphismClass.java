package PackageSelenium;

public class PolymorphismClass {

	public static void main(String args[]){
		AClass aObj = new AClass();
		aObj.createContact("venkat ","8056312812","8220395656");
		new BClass();
		aObj.createContact("Avenkat ","8056312812","8220395652");}}

