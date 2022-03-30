package com.qa.results;

import java.util.Scanner;

public class Input {
	static Scanner input = new Scanner(System.in);
	static int chemistry;
	static int physics;
	static int biology;
	
	public static int getChemistryResult() {
		System.out.println("Enter Chemistry result ");
		chemistry = input.nextInt();
		return chemistry;
	}
	public static int getPhysicsResult() {
		System.out.println("Enter Physics result ");
		physics = input.nextInt();
		return physics;
	}
	public static int getBiologyResult() {
		System.out.println("Enter Biology result ");
		biology = input.nextInt();
		return biology;
	}

	public static void close() {
		input.close();
	}


}
