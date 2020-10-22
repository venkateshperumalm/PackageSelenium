package com.packageselenium.collectionexcercises.w3resource.thread;

public class ThreadAClass extends Thread{
	//multiple access one
	ResourceClass rClass;
	public ThreadAClass(ResourceClass sync) {
		this.rClass = sync;
	}
	public void run(){
		rClass.doMultiply(5);
	}
}
