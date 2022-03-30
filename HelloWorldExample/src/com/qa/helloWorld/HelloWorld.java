package com.qa.helloWorld;

public class HelloWorld {

	public static void printMessage(String message) {
		System.out.println(message);
	}
	
	public static int intMethod() {
		return 4;
	}

	public static String Stringmethod() {
		return "Hi there";
	}
	
	public static float floatMethod() {
		    return 0.25f;
	}

	public static void main(String[] args) {
		printMessage("Hello World again! ");
		System.out.println(intMethod());
		System.out.println(floatMethod());		
		System.out.println(Stringmethod());
	}

}


