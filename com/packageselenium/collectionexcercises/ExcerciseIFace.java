package com.packageselenium.collectionexcercises;

public class ExcerciseIFace implements CharSequence{

	@Override
	public int length() {
		 String input = "he is a student";
		int lengthOfString = input.length();
		return lengthOfString;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
