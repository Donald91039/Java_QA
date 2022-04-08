package com.qa.tax;

public class Tax {
	
	static int taxRate;
	static double taxAmount = 0;
	static double tax1;
	static double tax2;
	static double tax3;
	static double tax4;
	
	public static void method1(double s) {
		
		if (s <= 14999) {
			taxRate = 0;
		} else if (s <= 19999) {
			taxRate = 10;
		} else if (s <= 29999) {
			taxRate = 15;
		} else if (s <= 44999) {
			taxRate = 20;
		} else {
			taxRate = 25;
		}
		System.out.println("Max tax rate " + taxRate + "%");
	}
	
	public static void method2(double s) {

		if (s <= 14999) {
			taxRate = 0;
			
		} else if (s <= 19999) {
			taxRate = 10;
			tax1 = ((s - 14999) / 100) * 10;
			 
		} else if (s <= 29999) {
			taxRate = 15;
			tax2 = ((s - 19999) / 100) * 15;
			
		} else if (s <= 44999) {
			taxRate = 20;
			tax3 =((s - 29999) / 100) * 15;
			
		} else {
			taxRate = 25;
			tax4 = ((s - 44999) / 100) * 10;
		}
		taxAmount = taxAmount + tax1 + tax2 +tax3 + tax4;
		System.out.println("Tax = £" + taxAmount);
	}
	
}
