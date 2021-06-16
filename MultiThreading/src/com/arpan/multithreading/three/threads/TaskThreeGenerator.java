package com.arpan.multithreading.three.threads;

public class TaskThreeGenerator implements Runnable {

	private Resource resource;

	public TaskThreeGenerator(Resource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			String message = "Thread 3-->" + i;
			resource.print(message);
		}

	}

}
