package com.packageselenium.collectionexcercises.w3resource.thread;

public class SyncClassMain {

	public static void main(String[] args) {
		SyncClass syn =new SyncClass();
		ThreadAClass a=new ThreadAClass(syn);
		ThreadBClass b=new ThreadBClass(syn);
		a.start();
		b.start();
	}
}