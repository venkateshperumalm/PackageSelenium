package com.packageselenium.collectionexcercises.w3resource.thread;

public class RunnableSample {

	public static void main(String[] args) {
		//Thread is a class which has methods like start(), run() to start and run threads
		new Thread(new Runnable(){
			//run() is the only abstract method present in Runnable Interface
			@Override
			public void run(){
				System.out.println("Thread started");
			}
		}).start();
	}
}
