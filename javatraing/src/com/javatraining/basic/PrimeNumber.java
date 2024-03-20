package com.javatraining.basic;

public class PrimeNumber {
	 public static void main(String[] args) {
	        int n = 4; // the number to be checked
	        if (isPrime(n)) {
	            System.out.println(n + " is a prime number");
	        } else {
	            System.out.println(n + " is not a prime number");
	        }
	    }

	    // Function to check if a number is prime
	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}

