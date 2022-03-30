package com.qa.packageTesting;

import java.util.Random;
import java.util.Scanner;

public class packageTesting {
	
	public int randomMethod(int i) {
		Random rand = new Random();
		return rand.nextInt(i);
	}
	
	public String scannerMethod() {
		
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	public static void main(String[] args) {
		packageTesting testing = new packageTesting();
		
		System.out.println(testing.randomMethod(20));
		System.out.println(testing.scannerMethod());
	}
}
