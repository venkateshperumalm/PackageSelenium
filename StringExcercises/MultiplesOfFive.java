package StringExcercises;

public class MultiplesOfFive {

	public void doMultiply(int n, int toBeMultiply){
		if(n<=1 || toBeMultiply <= 1){
			System.out.println(toBeMultiply);
		}else{
			for(int i=1;i<=n;i++){
				System.out.println(i*toBeMultiply);
			}
		}
	}

	public static void main(String args[]){
		MultiplesOfFive mul = new MultiplesOfFive();
		mul.doMultiply(5, 5);
	}

}
