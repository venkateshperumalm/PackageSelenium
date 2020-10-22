package StringExcercises;

public class StaticAndMain {
	static int p;
	public StaticAndMain(){
		System.out.println("constructor is created");
	}
	static{
		System.out.println("Inside static block");
		p=10;
	}
	static{
		System.out.println("Inside another static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("its main method");
		System.out.println(StaticAndMain.p);
	}
}
