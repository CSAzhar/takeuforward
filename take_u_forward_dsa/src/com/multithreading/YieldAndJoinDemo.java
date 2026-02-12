package com.multithreading;

public class YieldAndJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread mt = Thread.currentThread();
		
		Thread t = new Thread( () -> {
			
			for(int i = 0; i<= 100; i++) {
//				Thread.yield();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName()+" - "+i);
			}
		} );
		
		t.start();
	
		
		
		for(int i = 0; i<= 100; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
//		mt.join();
		
	}

}
