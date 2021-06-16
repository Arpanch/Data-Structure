package com.arpan.multithreading.three.threads;

public class TaskOneGenerator implements Runnable{

	private Resource resource;
	
	public TaskOneGenerator(Resource resource){
		this.resource=resource;
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			String message="Thread 1-->"+i;
			resource.print(message);
		}
		
	}

}
