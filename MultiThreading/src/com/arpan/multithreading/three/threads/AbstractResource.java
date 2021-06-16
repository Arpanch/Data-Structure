package com.arpan.multithreading.three.threads;

public abstract class AbstractResource implements Resource {
	
	private Lock lock;
	
	public AbstractResource(Lock lock) {
		super();
		this.lock = lock;
	}

	
	public void print(String msg,TaskType taskType) {
		synchronized(lock) {
			while(lock.getCurrentTask()!=taskType) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(msg);
			lock.setCurrentTask(taskType.getNextType());
			lock.notifyAll();
		}
		
	}
}
