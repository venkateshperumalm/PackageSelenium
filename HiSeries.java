
//Program to print series: 1,2,Hi,4,5,Hi....1000

public class HiSeries {
	public static void main(String[] args) {
		for(int index = 1;index <= 1000;index++){
			if(index % 3 == 0){
				System.out.println("Hi");
			}else{
				System.out.println(index);
			}
		}
	}
}
