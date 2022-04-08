package com.qa.calculator;

import java.util.Scanner;

public class InputCalc {
	
	private static Scanner scan = new Scanner(System.in);

		
	public static double returnNumber() {
// 		Returns a double for calc methods		
		System.out.println("Please enter a number");
		return Double.parseDouble(scan.nextLine());
	}
	
	public static String readOperation() {
//		To get user String input
		return scan.nextLine().toLowerCase();
	}

	public static void close() {
//		To close our scanner after we're finished
		scan.close();
	}

}
