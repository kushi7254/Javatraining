package com.javatraing.conditions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx {
public static void main(String[] args) {
	Set<String> hs= new HashSet<>();
	hs.add("apple");
	hs.add("ball");
	hs.add("cat");
	hs.add(null);
	hs.add(null);
	hs.add("cat");
	System.out.println(hs);
	
	Set<Integer> hs1= new TreeSet<>();
	hs1.add(21);
	hs1.add(10);
	hs1.add(23);
	hs1.add(9);
	System.out.println(hs1);
}
}
