package StringExcercises;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			testExceptions();
			//}catch(FileNotFoundException e | IOException e){ //2 ways are there to avoid this compile time error
			//e.printStackTrace();
			//}
			//way1: providing both exception in individual catch block as FileNotFoundException is a subclass of IOException
		} catch(FileNotFoundException e){
			e.printStackTrace();
			//way2: Providing IOException alone in a catch block
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void testExceptions() throws IOException, FileNotFoundException{

	}
}
