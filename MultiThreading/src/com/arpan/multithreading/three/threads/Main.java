package com.arpan.multithreading.three.threads;

public class Main {
	public static void main(String[] args) {
		Thread th1=new Thread(new TaskOneGenerator(ResourceProvider.getResource(TaskType.TASK_1)));
		Thread th2=new Thread(new TaskTwoGenerator(ResourceProvider.getResource(TaskType.TASK_2)));
		Thread th3=new Thread(new TaskThreeGenerator(ResourceProvider.getResource(TaskType.TASK_3)));
		Thread th4=new Thread(new Task4Generator(ResourceProvider.getResource(TaskType.TASK_4)));
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}
