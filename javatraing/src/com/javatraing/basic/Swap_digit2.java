package com.javatraing.basic;

import java.util.Scanner;

public class Swap_digit2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		int temp;
		
		temp=a;//30
		a=b;//40
		b=temp;//30
		
		System.out.println("a value " + a);
		System.out.println("b value " + b);	
	}
}
