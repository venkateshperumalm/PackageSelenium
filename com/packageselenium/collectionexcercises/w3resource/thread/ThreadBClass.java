package com.packageselenium.collectionexcercises.w3resource.thread;

public class ThreadBClass extends Thread {
	//multiaccess two
	SyncClass s;
	public ThreadBClass(SyncClass sync) {
		this.s=sync;
	}
	public void run(){
		s.doMultiply(100);
	}

}
