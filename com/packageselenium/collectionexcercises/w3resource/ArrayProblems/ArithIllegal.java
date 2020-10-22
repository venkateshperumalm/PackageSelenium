package com.packageselenium.collectionexcercises.w3resource.ArrayProblems;

public class ArithIllegal {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		try{
			invokeDivision(a,b);
		}catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
	}

	private static int invokeDivision(int a, int b) {
		int res = 0;
		try{
			res = divideValues(a,b);
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}
		return res;
	}

	private static int divideValues(int a, int b) {
		int i = a / b;
		return i;
	}
}
