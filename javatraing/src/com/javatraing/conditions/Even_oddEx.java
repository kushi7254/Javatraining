package com.javatraing.conditions;

import java.util.Scanner;

public class Even_oddEx {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any value");
	int a=sc.nextInt();
	if(a%2==0) {
		System.out.println("even num");
	}
	else {
		System.out.println("odd num");
	}
	
}
}
