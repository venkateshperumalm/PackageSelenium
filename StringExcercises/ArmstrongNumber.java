package StringExcercises;

import java.util.Scanner;

public class ArmstrongNumber{

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int ab;
		System.out.println("Enter no to be checked");
		ab=a.nextInt();
		if(checkArmstrong(ab)==ab){
			System.out.println("Given is Armstrong number");
		}else
			System.out.println("Not a Armstrong number");
	}
	public static int checkArmstrong(int ab){
		//153=13+53+33=ab
		int rem=0;
		int sumValue=0;
		while(ab != 0){
			rem = ab%10;
			sumValue += rem*rem*rem;
			ab = ab /10;//153/10=15
		}
		return sumValue;
	}
}
