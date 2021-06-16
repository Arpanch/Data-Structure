package com.arpan.sequence.substring;
import java.util.ArrayList;
import java.util.List;

public class PrintAllSubString {
public static void main(String[] args) {
	String y="ABABC";
	long startTime = System.nanoTime();
	printAllSubString(y);
	long endTime = System.nanoTime();
	long duration=endTime - startTime;
	double seconds = (double)duration / 1_000_000_000.0;
	System.out.println(seconds);
}

private static void printAllSubString(String y) {
	List<String> list=new ArrayList<>();
	for(int i=0;i<y.length();i++) {
		StringBuilder s=new StringBuilder();
		s.append(y.charAt(i));
		list.add(s.toString());
		for(int j=i+1;j<y.length();j++) {
			list.add(s.append(y.charAt(j)).toString());
		}
	}
	for(int i=0;i<list.size();i++) {
		System.out.println((i+1)+" :  "+list.get(i));
	}
	
}
}
