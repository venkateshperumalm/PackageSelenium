package StringExcercises;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		
		for(int index = 0; index <= 50;index++){
			checkPrimeOrNot(index);
		}
	}
	public static int checkPrimeOrNot(int index){
		//17/1 and itself
		if(index % 2 == 0 && index/index == 1){
		return index;
	}
	return -1;
	}
}
