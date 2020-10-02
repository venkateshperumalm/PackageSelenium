package com.packageselenium.collectionexcercises.w3resource.thread;

public class ThreadAClass extends Thread{
	//multiple access one
	SyncClass s;
	ThreadAClass(SyncClass sync){
		this.s=sync;
	}
	public void run(){
		s.doMultiply(5);
	}
}
