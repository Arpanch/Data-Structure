package com.arpan.multithreading.odd.even;

public class ResourceProvider {
	
	private static Lock lock=new Lock();
	
	
	private static PrintResource getOddGeneratorResource() {
		PrintResource oddResource=new OddPrintResource(lock);
		return oddResource;
	}
	
	private static PrintResource getEvenGeneratorResource() {
		PrintResource evenResource = new EvenPrintResource(lock);
		return evenResource;
	}
	
	public static PrintResource getResource(ResourceType type) {
		if (type == ResourceType.OddResource) {
			return getOddGeneratorResource();
		}
		return getEvenGeneratorResource();
	}
	
	
	
}
