package com.packageselenium.collectionexcercises;

public class Employee implements Comparable<Employee> {

	String names;
	int id;
	public String getName(){
		return names;
	}

	public void setName(String names){
		this.names = names;
	}

	public int getId(){
		return id;
	}

	public void setId(int ide){
		this.id = ide;
	}

	Employee(String name, int id){
		this.names = name;
		this.id = id;
	}
	@Override
	public int compareTo(Employee obj) {
		if (this.getId() == obj.getId()) return 0;
		else

			if (this.getId() < obj.getId()) return 1;
			else return -1;
	}

}
