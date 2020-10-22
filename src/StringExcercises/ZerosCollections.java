package StringExcercises;

import java.util.ArrayList;
import java.util.List;

public class ZerosCollections {
	public void placeZerosEnd(int[] arr, int n) {
		List<Integer> noZeros = new ArrayList<Integer>();
		List<Integer> onlyZeros = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++){
			if(arr[i] != 0){
				noZeros.add(arr[i]);
			}else{
				onlyZeros.add(arr[i]);
			}
		}
		noZeros.addAll(onlyZeros);
		StringMain.printArrayColl(noZeros);
//		for(int result : noZeros)
//			System.out.println(result);
	}
}
