package com.multithreading.blockingQueue;

public interface BlockingQueue<T> {
	
	public void add(T a) throws InterruptedException;
	
	public T get() throws InterruptedException;

}
