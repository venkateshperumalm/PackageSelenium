package StringExcercises;

public class StringBufferExample {

	public StringBuffer getString(String str){
		StringBuffer sb = new StringBuffer(str);
		sb.append("Buffer");// Buffer
		sb.insert(2, " ab ");// B ab uffer
		//sb.delete(1, 3);
		sb.indexOf(str, 3);
		System.out.println("Capacity: " +sb.capacity());
		
		System.out.println("Length: " +sb.length() + "\nFinding index: " +sb.indexOf(str, 1));
		return sb;
	}
	public static void main(String args[]){
		StringBufferExample ob = new StringBufferExample();
		System.out.println(ob.getString(" "));
	}
}
