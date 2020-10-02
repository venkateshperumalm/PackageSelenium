package StringExcercises;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int yearToBeChecked = s.nextInt();
		if(isLeapYear(yearToBeChecked)){
			System.out.println(yearToBeChecked +" is a Leap Year");
		}else{
			System.out.println(yearToBeChecked +" is Not a Leap Year");
		}
	}
	public static boolean isLeapYear(int leapYear){
		return (leapYear % 100 == 0) ? (leapYear % 400 ==0) : (leapYear % 4 == 0);
	}
}
