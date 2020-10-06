package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history = "0"; // Variable for transaction history
  private String op = ""; // Variable for the operation added to history
  
  public AddingMachine () {
    total = 0;  // Not needed - included for clarity
  }
  
  public int getTotal () { // Returns total
    return total;
  }
  
  public void add (int value) { // Add inputed value to total value
	  total += value;
	  op = " + " + value; 
	  history += op;
  }

  public void subtract (int value) { // Subtract inputed value from total value
	  total -= value;
	  op = " - " + value;
	  history += op;
  }

  public String toString () { // Return the history of transactions
    return history;
  }

  public void clear() { // Clears the "memory"
	  history = "0";
	  total = 0;
  }
}


