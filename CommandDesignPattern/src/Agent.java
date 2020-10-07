/**
 * Holds the arraylist of Commands called orders and all the methods for the arraylist looping.
 * @author Cole Burnworth
 *
 */
import java.util.*;
public class Agent {
	private ArrayList<Command> orders;
	
	/**
	 * Initializes the array in the class constructor
	 */
	public Agent() {
		orders = new ArrayList<Command>(); 
	}
	
	/**
	 * The command is added to the array list of orders
	 * @param command - Passes in the command that the user selects.
	 */
	public void placeOrder(Command command) {
		orders.add(command);
	}
	
	/**
	 * Loops through the list of orders and executes each one with a for loop
	 */
	public void processOrders() {
		for (Command order : orders) {
			order.execute();
		}
	}
}
