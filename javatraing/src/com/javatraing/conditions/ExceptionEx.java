package com.javatraing.conditions;

public class ExceptionEx {
	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2, 3, 4, 5 };
			String s = null;
			System.out.println(s.length());
			System.out.println(arr[5]);
			arr[2] = 10 / 0;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("size is incorrect :" + e);

		} catch (ArithmeticException e) {
			
			System.out.println("can't divided by zero :" + e);
			
		} catch (NullPointerException e) {
			
			System.out.println("exception :" + e);
			
		} catch (Exception e) {
			
			System.out.println("parent exception :" + e);
		}
		System.out.println("code executed");
	}
}
