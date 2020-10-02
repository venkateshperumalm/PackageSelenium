package com.packageselenium.collectionexcercises;

public class SuperClassSuper {

	public void printStatement(){
		System.out.println("SuperClass print statement");
	}

	public static void main(String[] args) {
		SubClassSuper subObj = new SubClassSuper();
		subObj.printStatement();
	}

}
