package StringExcercises;

public class ExceptionPropagation {

	 public void method3(){
		    int i = 100/0;
		  }
		  public void method2(){
		    method3();
		  }
		  
		  public void method1(){
		    try{
		      method2();
		    }
		    catch(Exception e){
		      System.out.println("Arithmetic exception unchecked exception will occur");
		    }
		  }
}