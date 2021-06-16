package com.multithreading.blockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Integer> blockingQueue;
	
	public Producer(BlockingQueue<Integer> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}



	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				blockingQueue.add(Integer.valueOf(i));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
