package com.arpan.multithreading.three.threads;

public class ResourceProvider {
	
	private static Lock lock=new Lock();
	
	public static Resource getResource(TaskType type) {
		if(type==TaskType.TASK_1) {
			return new TaskOnePrintResource(lock);
		}
		if(type==TaskType.TASK_2) {
			return new TaskTwoResourceGenerator(lock);
		}
		
		if(type==TaskType.TASK_3) {
			return new TaskThreeResourceGenerator(lock);
		}
		if(type==TaskType.TASK_4) {
			return new TaskFourPrintResource(lock);
		}
		return null;
	}
}
