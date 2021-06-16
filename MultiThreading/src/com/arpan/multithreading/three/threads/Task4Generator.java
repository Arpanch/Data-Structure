package com.arpan.multithreading.three.threads;

public class Task4Generator implements Runnable{
private Resource resource;
	
	public Task4Generator(Resource resource){
		this.resource=resource;
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			String message="Thread 4-->"+i;
			resource.print(message);
		}
		
	}

}
