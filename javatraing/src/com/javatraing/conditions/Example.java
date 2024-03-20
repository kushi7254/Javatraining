package com.javatraing.conditions;

import java.util.Scanner;

public class Example {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the percentage");
	int a=sc.nextInt();
	if(a>=80) {
		System.out.println( a + "% 1st division");
	}
	else if(a>=60) {
		System.out.println(a + "% 2nd division");
	}
	else if(a>=35) {
	System.out.println(a + "% 3rd division");
	}
	else {
		System.out.println(a + "% failed");
	}
}
}
