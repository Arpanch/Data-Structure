package com.arpan.multithreading.odd.even;

public class EvenPrintResource implements PrintResource {

	private Lock lock;
	
	public EvenPrintResource(Lock lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void print(int i) {
		synchronized (lock) {

			if (!lock.isOddGenerated()) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(i);
			lock.setOddGenerated(false);
			lock.notifyAll();

		}
	}
}
