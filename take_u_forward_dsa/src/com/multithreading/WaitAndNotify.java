package com.multithreading;

class SharedResourcec{
	private int data;
	private boolean hasdata = false;
	
	public synchronized void produce(int value) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(hasdata) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		data = value;
		hasdata = true;
		System.out.println("Produced data = "+value);
		notify();
	}
	
	public synchronized void consume() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while( !hasdata ) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Consumed = "+data);
		hasdata = false;
		notify();
	}
}
class Producer extends Thread {
	SharedResourcec resource;

    Producer(SharedResourcec r) {
        this.resource = r;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
        }
    }
}

class Consumer extends Thread {
	SharedResourcec resource;

    Consumer(SharedResourcec r) {
        this.resource = r;
    }

    public void run() {
        for (int i = 1; i <= 2; i++) {
            resource.consume();
        }
    }
}

public class WaitAndNotify {
	
	public static void main(String[] args) {
		SharedResourcec resource = new SharedResourcec();

        Producer p = new Producer(resource);
        Consumer c = new Consumer(resource);

        p.start();
        c.start();
	}

}
