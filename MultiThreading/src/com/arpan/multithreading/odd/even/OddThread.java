package com.arpan.multithreading.odd.even;

public class OddThread implements Runnable {
 
	private PrintResource printResource;
	
	
	
	public OddThread(PrintResource printResource) {
		super();
		this.printResource = printResource;
	}



	@Override
	public void run() {
		for (int i = 1; i < 1000; i = i + 2) {
			printResource.print(i);
		}

	}

}
