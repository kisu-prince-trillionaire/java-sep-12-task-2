package com.demo.navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMain {

	public static void main(String[] args) {
		NavigableSet<String> ts = new TreeSet<String>();
		
		ts.add("Ram");
		ts.add("Jam");
		ts.add("Sam");
		ts.add("Bam");
		ts.add("Tam");
		
		System.out.println(ts);
		String check = "Ram";
		System.out.println(ts.contains(check));
	}

}
