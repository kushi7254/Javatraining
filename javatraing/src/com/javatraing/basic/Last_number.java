package com.javatraing.basic;

import java.util.Scanner;

public class Last_number {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the value");
	int num=sc.nextInt();
	int rem=num%10;
	System.out.println(rem);
}
}
