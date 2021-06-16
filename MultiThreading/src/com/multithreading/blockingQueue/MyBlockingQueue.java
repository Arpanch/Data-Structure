package com.multithreading.blockingQueue;

import java.util.ArrayList;
import java.util.List;

public class MyBlockingQueue<T> implements BlockingQueue<T> {

	/*Default size consider as 10*/
	private int size=10;
	
	private List<T> list=new ArrayList<>();
	
	public MyBlockingQueue(int size) {
		super();
		this.size = size;
	}

	@Override
	public void add(T a) throws InterruptedException {
		synchronized (this) {
			if (list.size() == this.size) {
				wait();
			}

			list.add(a);
			System.out.println("Produced by producer "+a);
			notifyAll();
		}
	}

	@Override
	public T get() throws InterruptedException {
		synchronized (this) {
			if (list.size() == 0) {
				wait();
			}

			T element = list.remove(0);
			notifyAll();
			System.out.println("Consumed by consumer "+element);
			return element;
		}
	}
	

}
