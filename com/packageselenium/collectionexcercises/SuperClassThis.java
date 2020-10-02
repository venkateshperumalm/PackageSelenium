package com.packageselenium.collectionexcercises;

public class SuperClassThis {
	public SuperClassThis(){
		this(10);
		System.out.println("Default consructor of SuperClassThis");
	}
	public SuperClassThis(int a){
		System.out.println("Parameterized consructor of SuperClassThis");
	}

	public static void main(String[] args) {
		new SuperClassThis();
		System.out.println("Inside main");
	}
}
