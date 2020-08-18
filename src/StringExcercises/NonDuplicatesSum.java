package StringExcercises;

public class NonDuplicatesSum {

	public static void main(String[] args) {
		int allArr[] = {1,2,2,3,4,5,4};//1,2,2,3,4,4,5
		int sum=0;
		//int dupA[] = {0};
		int size = allArr.length;
		for (int i=0;i< size-1;i++){
			if(allArr[i]!=allArr[i+1]){
				sum+=allArr[i];//0loop-1,1loop-1,
			}else{
				i++;
			}
		}
		System.out.println("Sum of non duplicates elements:" +sum);
	}
}
