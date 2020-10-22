package com.packageselenium.collectionexcercises;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String args[]){

		TreeSet<Employee> treeSet = new TreeSet<Employee>();
		treeSet.add(new Employee("abcd",1));
		treeSet.add(new Employee("abc",1));
		treeSet.add(new Employee("xyz",2));
		treeSet.add(new Employee("ssd",3));
		treeSet.add(new Employee("ert",4));

		Iterator<Employee> itEmployee = treeSet.iterator();
		while(itEmployee.hasNext()){
			Employee bj = itEmployee.next();
			System.out.println(bj.getName() +" " +bj.getId());
		}
	}
}
