package StringExcercises;

public class Students {
	int id;
	String name;
	public Students(int ids,String names){
		this.id = ids;
		this.name = names;
	}

	public int getid(){
		return id;
	}
	public void setId(int ids){
		this.id=ids;
	}
	public String getName(){
		return name;
	}
	public void setName(String names){
		this.name = names;
	}
	@Override
	public int hashCode(){
		return id;
	}
}
