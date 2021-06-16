package com.multithreading.blockingQueue;

public class Consumer implements Runnable {

	
private BlockingQueue<Integer> blockingQueue;
	
	public Consumer(BlockingQueue<Integer> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}

	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				blockingQueue.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
