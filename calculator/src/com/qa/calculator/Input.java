package com.qa.calculator;

import java.util.Scanner;

public class Input {
	static Scanner input = new Scanner(System.in);
	static double x;
	static double y;
	static String op;

	public static double readNumber1() {
		System.out.println("Enter first number ");
		x = input.nextDouble();
		return x;
	}
	public static double readNumber2() {
		System.out.println("Enter second number ");
		y = input.nextDouble();
		return y;
	}
	public static String readOperation() {
		System.out.println("Welcome to a simple calculator");
		System.out.println("Enter the operation (+ , - , /), or Exit ");
		op = input.next();
		return op;
	}

	public static void close() {
		input.close();
	}

}
