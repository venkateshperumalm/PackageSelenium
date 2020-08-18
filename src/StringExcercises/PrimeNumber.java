package StringExcercises;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num;
		Scanner inputS = new Scanner(System.in);
		num = inputS.nextInt();
		if(num<=1){
			System.out.println("Neither Prime No nor Composite No");
		}else if(isPrime(num)){
			System.out.println("Prime No");
		}else{
			System.out.println("Not Prime No");
		}
	}

	public static boolean isPrime(int num) {
		int middle=0;
		middle = num/2;
		for(int i = 2;i <= middle ;i++){
			if(num % i == 0)
				return false;
		}
		return true;
	}
}
