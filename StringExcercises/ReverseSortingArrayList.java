package StringExcercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseSortingArrayList {
	
	public void doSort(){
		List<String> cusName = new ArrayList<>();
		cusName.add("ram");
		cusName.add("venkat");
		cusName.add("kumar");
		cusName.add("perumal");
		cusName.add("23");
		cusName.add("1");
		
		Collections.sort(cusName, Collections.reverseOrder());
		for(String a : cusName){
			System.out.println(a);
		}
	}
	

}
