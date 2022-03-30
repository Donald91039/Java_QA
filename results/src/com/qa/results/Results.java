package com.qa.results;

public class Results {
	static double total;
	static double percentage;
	static String pass = "Pass";
	static double passG = 60;
	
	public static double calcTotal(double chemistry, double physics, double biology) {
		total = chemistry+physics+biology;
		return total;
	}
	
	public static double calcPercentage(double total) {
		percentage = (total * 100)/450;
		return percentage;
	}
	
	public static String calcPass(double chemistry, double physics, double biology) {
		if ((chemistry*100)/150 < passG) {
			System.out.println("Failed Chemistry");
			pass = "Fail";
		}
		if ((physics*100)/150 < passG) {
			System.out.println("Failed Physics");
			pass = "Fail";
		}
		if ((biology*100)/150 < passG) {
			System.out.println("Failed Biology");
			pass = "Fail";
		}
		if ((total*100)/450 < passG) {
			pass = "Fail";
		}
		return pass;
	}
	

}
