package cse360assignment02;

/**
 * 
 * author: Christopher Olson
 * class: CSE360
 * proj: Assignment2
 * Desc: calculator class that contains the main method
 * 		used to create an AddingMachine object and compute
 * 		methods from that object.
 *
 **/

public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add (4); 
		myCalculator.subtract (2); 
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
		System.out.println(myCalculator.getTotal());
		myCalculator.clear();
		myCalculator.add (10); 
		myCalculator.subtract (6); 
		myCalculator.add(1);		
		System.out.println(myCalculator.toString());
		System.out.println(myCalculator.getTotal());
		
		

		

	}



}
