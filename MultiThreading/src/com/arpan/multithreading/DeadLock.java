package com.arpan.multithreading;

public class DeadLock {
	public static class Resource{
		int value;
	}
	Resource r1=new Resource();
	Resource r2=new Resource();
	
	public int read() throws InterruptedException {
		synchronized (r1) {
			Thread.sleep(200);
			synchronized (r2) {
				return r1.value+r2.value;
			}
			
		}
	}
	
	public void write(int ra, int rb) throws InterruptedException {
		synchronized (r2) {
			Thread.sleep(100);
			synchronized (r1) {
				this.r1.value=ra;
				this.r2.value=rb;
			}
			
		}
	}
	

	
	
	public static void main(String[] args) {
		DeadLock d1=new DeadLock();
		Task task=new Task(d1);
		Thread th1=new Thread(task);
		Thread th2=new Thread(task);
		th1.start();
		th2.start();
		
	}
}

class Task implements Runnable{
	private DeadLock deadLock;

	public DeadLock getDeadLock() {
		return deadLock;
	}

	public void setDeadLock(DeadLock deadLock) {
		this.deadLock = deadLock;
	}

	public Task(DeadLock deadLock) {
		super();
		this.deadLock = deadLock;
	}

	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			try {
				deadLock.write(i, i+1);
				System.out.println(deadLock.read());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
