package com.packageselenium.collectionexcercises.w3resource.thread;

public class SyncClass {
	//shared resource
	//volatile static int a=5;
	synchronized public void doMultiply(int n){
		for(int i=1;i<=5;i++){  
			System.out.println(n*i);  
			try{  
				Thread.sleep(400);  
			}catch(Exception e){System.out.println(e);}  
		}  
	}
}
//synchronization-volatile keyword