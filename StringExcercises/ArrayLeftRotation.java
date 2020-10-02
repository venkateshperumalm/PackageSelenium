package StringExcercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayLeftRotation {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffReader = new BufferedReader(in);
		int elementsCount = buffReader.read();
		int noOfRotation = buffReader.read();
		int[] intArr= new int[elementsCount];
		for(int index = 0;index < elementsCount;index++){
			intArr[index] = buffReader.read();
		}
		rotateLeft(intArr, elementsCount, noOfRotation);
		buffReader.close();
		in.close();
	}
	public static void rotateLeft(int[] intArr, int elementsCount, int noOfRotation){

		int[] rotationArray = {};
		int[] tempArray = {};
		for(int index = 0;index < noOfRotation;index++){
			rotationArray[index] = intArr[index]; 
		}
		for(int i = 0;i<rotationArray.length;i++){
			System.out.println(rotationArray[i]);
		}
	}
}
