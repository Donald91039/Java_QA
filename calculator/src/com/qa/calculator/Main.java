package com.qa.calculator;

public class Main {

	public static void main(String[] args) {
		double  x = Input.readNumber1();
		double y = Input.readNumber2();
		String r = Input.readOperation();
		
		do {
			switch (r) {
			case ("/"):
				if (x < y) {
					System.out.println("Second number was higher than first, division not possible.");
				}
				else {
					double result3 = Calculator.divMethod(x,y);
					System.out.println("Div Result = " + result3);
					}
					break;
			case ("+"):
				double result1 = Calculator.addMethod(x, y);
				System.out.println("Add Result = " + result1);
				break;
			case ("-"):
				double result2 = Calculator.subMethod(x,y);
				System.out.println("Sub Result = " + result2);
				break;
			default:
				System.out.println("You input the wrong operator");
				break;
			}
		}
		while (r!="Exit"); {
			System.out.println("Bye");
			Input.close();
		}
	}
}
	


