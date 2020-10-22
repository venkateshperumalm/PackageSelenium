package StringExcercises;

public class EndsWithZeros {

	/*
	 * Given a number in an array form. 
	 * Write a program to move all zeros to the end.
	 */
	public void placeZeros(int arr[], int n){
		int count =0;
		int temp;

		for(int i=0;i<n;i++){
			if((arr[i] != 0)){
				temp = arr[count];
				arr[count] = arr[i];
				arr[i]=temp;
				count+=1;
			}
		}
	}
}
