package com.packageselenium.collectionexcercises.w3resource.thread;

public class ThreadBClass extends Thread {
	//multiaccess two
	ResourceClass rClass;
	public ThreadBClass(ResourceClass sync) {
		this.rClass = sync;
	}
	public void run(){
		rClass.doMultiply(100);
	}

}
