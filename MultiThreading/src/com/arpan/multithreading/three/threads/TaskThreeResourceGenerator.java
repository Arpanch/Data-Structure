package com.arpan.multithreading.three.threads;

public class TaskThreeResourceGenerator extends AbstractResource {

	public TaskThreeResourceGenerator(Lock lock) {
		super(lock);
	}

	@Override
	public void print(String msg) {
		super.print(msg,TaskType.TASK_3);
		
	}
	
}
