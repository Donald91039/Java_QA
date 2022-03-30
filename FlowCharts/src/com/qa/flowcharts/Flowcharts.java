package com.qa.flowcharts;

public class Flowcharts {
	
	static int a;
	
	public static void flowMethodTwo(int n) {
		if (n > 2000) {
			System.out.println("A");
			if(n > 6000) {
				System.out.println("C");
			}
			else {
				System.out.println("B");
				if (n > 4000) {
					System.out.println("D");	
				}
				else
					System.out.println("E");
			}
		}
		else {
			System.out.println("1");
			if (n > 100) {
				System.out.println("3");
				if (n > 600) {
					System.out.println("4");
					if (n > 500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
			}
			else {
				System.out.println("2");
				}
			}
		}
	}
		
	public static void boolMethod(int o,int t, boolean opt ) {
		if (opt) {
			System.out.println(o+t);
		}
		else {
			System.out.println(o*t);
		}
	}
	
	public static void whileMethod() {
		a = 1;
		while (a <= 10) {
			for (int i=0;i<10;i++) {
				System.out.println(a);
			}
			a++;
		}
	}
	public static void forMethod() {
		a = 1;
		for (int i=0;i<10;i++) {
			for (int c=0; c<10; c++) {
				System.out.println(a);
			}
			a++;
		}
	}
	public static void MethodFive() {
		a =1;
		while (a <= 10) {
			for(int i=0; i<a; i++) {
				System.out.println(a);
			}
			a++;
		}
	}
	

}
