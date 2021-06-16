package com.arpan.multithreading.three.threads;

public class Lock {
	
	private TaskType currentTask=TaskType.TASK_4;

	public TaskType getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(TaskType currentTask) {
		this.currentTask = currentTask;
	}
	
	

}
