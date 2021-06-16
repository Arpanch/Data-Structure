package com.multithreading.blockingQueue;

public class Main {
public static void main(String[] args) {
	BlockingQueue<Integer> myBlockingQueue=new MyBlockingQueue<Integer>(2);
	Thread producerThread=new Thread(new Producer(myBlockingQueue));
	Thread consumerThread=new Thread(new Consumer(myBlockingQueue));
	
	consumerThread.start();
	producerThread.start();
}
}
