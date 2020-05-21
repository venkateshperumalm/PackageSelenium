package StringExcercises;

public class ReverseStringByWord {

public static void main(String[] args) {

String inputString = "Today is Holiday";
System.out.println("Enter a string");
  String[] strArr=inputString.split("\\s");
  for (int i = strArr.length-1; i >=0; i--) {
System.out.print(""+strArr[i]+" ");
}
}
}