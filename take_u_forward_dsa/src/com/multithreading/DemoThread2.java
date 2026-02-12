package com.multithreading;

class Azhar extends Thread{
	@Override
	public void run() {
		for(int i = 0; i< 10; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}

class Ali implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i< 10; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}

public class DemoThread2 {
	public static void main(String[] args) {
		Azhar t1 = new Azhar();
		t1.start();
		
		Ali a1 = new Ali();
		Thread t2 = new Thread(a1);
		t2.start();
		
		Thread t3 = new Thread( () -> {
			for(int i = 0; i< 10; i++) {
				System.out.println(Thread.currentThread().getName()+" - "+i);
			}
		} );
		t3.start();
		
		for(int i = 0; i< 10; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}
