package com.javatraing.conditions;


import java.util.LinkedList;

public class LinkListEx {
public static void main(String[] args) {
	LinkedList<Integer> al=new LinkedList<>();
	al.add(21);
	al.add(34);
	al.add(76);
	al.add(34);
	al.add(76);
	int size=al.size();
	System.out.println(size);
	System.out.println(al.get(1));
	System.out.println(al.get(2));
	System.out.println(al.remove(0));
	System.out.println(al);
	boolean b=al.contains(75);
	System.out.println(b);
	for(Integer n1:al) {
		System.out.println(n1);
	}
	al.clear();
	System.out.println(al);
	//int newCapacity = (oldCapacity * 3)/2 + 1;
}
}
