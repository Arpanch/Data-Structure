package com.arpan.multithreading.three.threads;

public class TaskTwoGenerator implements Runnable {

	private Resource resource;

	public TaskTwoGenerator(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			String message = "Thread 2-->" + i;
			resource.print(message);
		}

	}

}
