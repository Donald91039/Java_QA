package com.qa.calculator;


public class MenuCalc {
	
	String exitCall = "true";
	
	
	public void run() {
		do {
			Calculator calc = new Calculator();
			String action = getAction();
			Actions(action, calc);
		} while(exitCall != "exit");
	}
		
	

	public String getAction() {
		String menuMsg = "==================================================\n" + "Calculator System:\n"
				+ "==================================================\n" + "\t- Add - add two parameters together"
				+ "\n" + "\t- Subtract - subtract an input from the second" + "\n"
				+ "\t- Multiply - multiply parameters together" + "\n" + "\t- Divide - divide a parameter by the other"
				+ "\n" + "\t=====\n" + "\t- Exit - Exit Application\n"
				+ "==================================================\n";
		System.out.println(menuMsg + "What calculation do you want to perform?");

		return InputCalc.readOperation();

	}

	public void Actions(String action, Calculator calc) {
		switch (action) {
		case "add":
			System.out.println(
					"Your answer is: " + calc.add(InputCalc.returnNumber(), InputCalc.returnNumber()));
			break;
		case "subtract":
			System.out.println(
					"Your answer is: " + calc.sub(InputCalc.returnNumber(), InputCalc.returnNumber()));
			break;
		case "divide":
			try {
				System.out
						.println("Your answer is: " + calc.div(InputCalc.returnNumber(), InputCalc.returnNumber()));
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			break;
		case "multiply":
			System.out.println("Your answer is: " + calc.mult(InputCalc.returnNumber(), InputCalc.returnNumber()));
			break;
		case "exit":
			System.out.println("Closing.");
			exitCall = "exit";
			break;
		default:
			System.out.println("No match found");
			break;

		}

	}
}