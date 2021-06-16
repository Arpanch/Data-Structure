package com.arpan.multithreading.three.threads;

public enum TaskType {
	
	TASK_4,TASK_3,TASK_2,TASK_1;
	
	public int getSequenceNumber() {
		return this.ordinal();
	}
	
	public TaskType getNextType() {
		int totalEnumLength=TaskType.values().length;
		int nextEnumSequence=(this.getSequenceNumber()+1)%totalEnumLength;
		return TaskType.values()[nextEnumSequence];
	}

}
