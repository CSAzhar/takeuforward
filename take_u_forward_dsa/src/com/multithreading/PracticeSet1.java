package com.multithreading;

class MyThreadA extends Thread {
	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}

class MyThreadB extends Thread {
	MyThreadA t1;
	MyThreadB(MyThreadA t1){
		this.t1 = t1;
	}
	
	@Override
	public void run() {
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i<100; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}

public class PracticeSet1 {
	
	public static void main(String[] args) throws InterruptedException {
		MyThreadA t1 = new MyThreadA();
		Thread t2 = new MyThreadB(t1);
		
		
		t1.start();
		t2.start();
		
//		t1.join();
		t2.join();
		
		
		for(int i = 0; i<100; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
//		Thread.currentThread().join();      -> causes Dead lock situation
		
	}

}
