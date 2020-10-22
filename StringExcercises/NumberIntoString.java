package StringExcercises;

import java.util.Scanner;

public class NumberIntoString {

	public static void main(String[] args) {
		int n;
		int sum=0;
		int r;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter no to be checked");
		n=a.nextInt();  
		System.out.println("enter the number=");    
		while(n>0) //125   
		{    
			r=n%10; //5   
			sum=sum*10+r;//5    
			n=n/10;//12    
		}    
		n=sum; // 5  
		while(n>0)    
		{    
			r=n%10;//5%10    
			switch(r)    
			{    
			case 1:    
				System.out.print("one ");    
				break;    
			case 2:    
				System.out.print("two ");    
				break;    
			case 3:    
				System.out.print("three ");    
				break;    
			case 4:    
				System.out.print("four ");    
				break;    
			case 5:    
				System.out.print("five ");    
				break;    
			case 6:    
				System.out.print("six ");    
				break;    
			case 7:    
				System.out.print("seven ");    
				break;    
			case 8:    
				System.out.print("eight ");    
				break;    
			case 9:    
				System.out.print("nine ");    
				break;    
			case 0:    
				System.out.print("zero ");    
				break;    
			default:    
				System.out.print("tttt");    
				break;    
			}    
			n=n/10;    
		}    
	}  
}
