package StringExcercises;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int ab;
		System.out.println("Enter no to be checked");
		ab=a.nextInt();
		if(checkArmstrong(ab)==ab){
			System.out.println("Given is armstrong number");
		}else
			System.out.println("Not a Armstrong number");


	}
	public static int checkArmstrong(int ab){
		//153=13+53+33=ab
		int rem=0;
		int div=0;
		int addAll=0;
		while(ab != 0){
			rem=ab%10;
			addAll += rem*rem*rem;
			div = ab /10;//153/10=15
			ab=div;
		}
return addAll;
	}
}
