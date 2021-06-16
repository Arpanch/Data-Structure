package com.arpan.multithreading.odd.even;

public class EvenThread implements Runnable {

	private PrintResource printResource;

	
	
	public EvenThread(PrintResource printResource) {
		super();
		this.printResource = printResource;
	}



	public void run() {
		for (int i = 0; i <= 1000; i = i + 2) {
			printResource.print(i);
		}
	}
}
