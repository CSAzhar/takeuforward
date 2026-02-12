package com.multithreading;

public class SleepAndInterruptSleep {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread( () -> {
			
			for(int i = 0; i<1000; i++) {
				System.out.println(Thread.currentThread().getName()+ " - "+i);
			}
			
			
		} );
		t1.setDaemon(true);
//		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		System.out.println(t1.isDaemon());
		
		for(int i = 0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+ " - "+i);
		}
		
		
		System.out.println(Thread.currentThread().isDaemon()+"main");
		
	}

}
