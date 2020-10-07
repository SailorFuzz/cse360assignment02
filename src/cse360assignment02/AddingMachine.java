package cse360assignment02;

/**
 * 
 * author: Christopher Olson
 * class: CSE360
 * proj: Assignment2
 * Desc: AddingMachine class that contains the constructor
 * 		and methods for the AddingMachine.  Keeps a record
 * 		of inputs and saves them to a string.
 *
 **/

public class AddingMachine {
  private int total;
  private String output;
  
  public AddingMachine () {
    total = 0; 
    output = "0";
    // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  output += " + " + value;
	  total += value;
  }

  public void subtract (int value) {
	  output += " - " + value;
	  total -= value;
  }

  public String toString () {
    return output;
  }

  public void clear() {
	  total = 0;
	  output = "0";
  }
  
  

}