package com.multithreading;

class Display{
//	public  void wish(String name) {
//		synchronized (this) {
//			for(int i = 0; i<=5; i++) {
//				System.out.println("Good Morning: "+name);
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					System.out.println(name);
//				}
//			}
//		}
		
	public synchronized void wish(String name) {
		for(int i = 0; i<=5; i++) {
			System.out.println("Good Morning: "+name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(name);
			}
		}
	}
}

class ThreadWish extends Thread{
	Display display;
	String name;
	
	public ThreadWish(Display d, String n) {
		this.display = d;
		this.name = n;
	}
	
	@Override
	public void run() {
		display.wish(name);
	}
}

public class SyncCheck {

	public static void main(String[] args) {
		Display d = new Display();
		ThreadWish t1 = new ThreadWish(d, "azhar");
		ThreadWish t2 = new ThreadWish(d, "ali");
		t1.start();
		t2.start();
		
	}
}
