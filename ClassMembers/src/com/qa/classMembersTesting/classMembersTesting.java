package com.qa.classMembersTesting;

public class classMembersTesting {
	private String firstName;
	private String surname;
	private int age;
	private static int numberOfPeople = 0;
	    
	public classMembersTesting(String firstName, String surname) {
	       this.firstName = firstName;
	       this.surname = surname;
	       numberOfPeople++;
	}
	
	public classMembersTesting(String firstName, String surname, int age) {
	       this.firstName = firstName;
	       this.surname = surname;
	       this.age = age;
	       numberOfPeople++;
	}
	
	public static int getNumberOfPeople() {
	        return numberOfPeople;
	    }
        
	 public String getSurname() {
	        return surname;
	     }
	            
	 public void setSurname(String surname) {
	         this.surname = surname;
	     }
	 
	 public int getage() {
	        return age;
	     }
	            
	 public void setage(int age) {
	         this.age = age;
	     }
	                
	 public String getFirstName() {
	         return firstName;
	     }
	                    
	 public void setFirstName(String firstName) {
	         this.firstName = firstName;
	     }
	        

	 public static void main(String[] args) {
		 
		 	System.out.println(classMembersTesting.getNumberOfPeople());   // output: 0    No objects instantiated)
		 		
	    	classMembersTesting firstCustomer = new classMembersTesting("Arnold","Rimmer");
	    	classMembersTesting secondCustomer = new classMembersTesting("David","Lister", 45);
	    	                
	    //	firstCustomer.setFirstName("Arnold J.");
	    //	secondCustomer.setFirstName("Dave");
	    	                        
	    	System.out.println(firstCustomer.getFirstName());   // output: Arnold J.)        
	    	System.out.println(secondCustomer.getFirstName());  // output: Dave
	    	System.out.println(secondCustomer.getage());
	   
	    	System.out.println(firstCustomer.getNumberOfPeople());  // output: 2)
	    	System.out.println(secondCustomer.getNumberOfPeople()); // output: 2
	    	System.out.println(classMembersTesting.getNumberOfPeople());       // output: 2)
	 }
	}
	
