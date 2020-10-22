import java.util.Scanner;

public class UnpairElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an add number: ");
		int numberOfelements = sc.nextInt();
		int array[] = new int[numberOfelements];
		for(int index = 0; index < numberOfelements;index++){
			array[index] = sc.nextInt();
		}
		int indexOne = findUnpairElement(array,numberOfelements);
		if(indexOne != -1){
			System.out.println(indexOne);
		}
	}
	public static int findUnpairElement(int array[], int numberOfElements){
		int temp[] = new int[numberOfElements];
		for(int indexX = 0; indexX < numberOfElements;indexX++){
			for(int indexY = indexX + 1 ; indexY < numberOfElements;indexY++){
				if(array[indexX] != array[indexY]){
					temp[indexX] = array[indexY];
				}
			}
			return array[indexX];
		}
		return -1;
	}
}
