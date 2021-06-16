package com.arpan.multithreading.three.threads;

public class TaskFourPrintResource extends AbstractResource {

	public TaskFourPrintResource(Lock lock) {
		super(lock);
	}

	@Override
	public void print(String msg) {
		super.print(msg,TaskType.TASK_4);
		
	}

}
