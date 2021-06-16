package com.arpan.multithreading.odd.even;

public class Main {
	public static void main(String[] args) {
		Thread odd=new Thread(new OddThread(ResourceProvider.getResource(ResourceType.OddResource)));
		Thread even=new Thread(new EvenThread(ResourceProvider.getResource(ResourceType.EvenResource)));
		even.start();
		odd.start();
		
		
	}
}
