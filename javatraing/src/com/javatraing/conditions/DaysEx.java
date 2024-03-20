package com.javatraing.conditions;

import java.util.Scanner;

public class DaysEx {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any week days");
	String s=sc.nextLine();
	switch(s) {
	case "sunday":
		System.out.println("today");
		break;
	case "monday":
		System.out.println("monday");
		break;
	case "tuesday":
		System.out.println("tuesday");
		break;
	case "thursday":
		System.out.println("thursday");
		break;
	case "friday":
		System.out.println("friday");
		break;
	case "wednesday":
		System.out.println("wednesday");
		break;
	case "saturday":
		System.out.println("saturday");
		break;
		default:
			System.out.println("its not a week days");
	}
}
}
