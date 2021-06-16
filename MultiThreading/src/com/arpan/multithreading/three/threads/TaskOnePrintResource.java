package com.arpan.multithreading.three.threads;

public class TaskOnePrintResource extends  AbstractResource {

	public TaskOnePrintResource(Lock lock) {
		super(lock);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(String msg) {
		super.print(msg, TaskType.TASK_1);	
	}
	
	

}
