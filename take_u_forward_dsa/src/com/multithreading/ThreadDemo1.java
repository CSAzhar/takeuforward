package com.multithreading;

class ThreadThreadDemo1Demo1 extends Thread{
	
	public void run() {
		for(int i = 0; i< 10; i++) {
			System.out.println("=====Child Thread - "+i);
			System.out.println(Thread.currentThread().getName());
		}
	}

}

public class ThreadDemo1{
	public static void main(String[] args) {
//		for(int i = 0; i<10; i++) {
//			ThreadThreadDemo1Demo1 thread  = new ThreadThreadDemo1Demo1();
//			thread.start();
//		}
		
		Thread th = new Thread(() -> {
			System.out.println("lambda thread");
		});
		
		th.start();
		
		for(int i = 0; i< 10; i++) {
			System.out.println("Parent thread - "+i);
			System.out.println(Thread.currentThread().getName());
		}
	}
}
