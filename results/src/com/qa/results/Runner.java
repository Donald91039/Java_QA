package com.qa.results;

import com.qa.results.Input;

public class Runner {
	
	public static void main(String[] args) {
		double  chemistry = Input.getChemistryResult();
		double physics = Input.getPhysicsResult();
		double biology = Input.getBiologyResult();
		
		System.out.println("Chemistry result = " + chemistry);
		System.out.println("Physics result   = " + physics);
		System.out.println("Biology result   = " + biology);
		double t = Results.calcTotal(chemistry, physics, biology);
		System.out.println("Total result     = " + t );
		double p = Results.calcPercentage(t);
		System.out.println("Total result     = " + p +"%");
		String r = Results.calcPass(chemistry, physics, biology);
		if (r == "Pass") {
			System.out.println("Congratulations you Passed");
		}
		else {
			System.out.println("Sorry Not today");
		}
	}

}
