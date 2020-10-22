package com.packageselenium.collectionexcercises.w3resource.thread;

public class SyncClassMain {

	public static void main(String[] args) {
		ResourceClass syn  = new ResourceClass();
		ThreadAClass a = new ThreadAClass(syn);
		ThreadBClass b = new ThreadBClass(syn);
		b.start();
		a.start();
	}
}