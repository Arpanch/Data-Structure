package com.arpan.multithreading.three.threads;

public class TaskTwoResourceGenerator extends AbstractResource {

	public TaskTwoResourceGenerator(Lock lock) {
		super(lock);
	}

	@Override
	public void print(String msg) {
		super.print(msg, TaskType.TASK_2);
		
	}

}
