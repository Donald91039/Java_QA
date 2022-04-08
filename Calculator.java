package com.qa.calculator;

public class Calculator {

	public double add(double num1, double num2) {
		return num1 + num2;
	}

	public double sub(double num1, double num2) {
		return num2 - num1;
	}

	public double div(double num1, double num2)  throws ArithmeticException {
		
		if (num1 == num2) {
			throw new ArithmeticException("Can't divide by 0!");
		} else {
			return num1 / num2;
		}
	}
	
	public double mult(double num1, double num2) {
		return num1 / num2;
	}
	
}