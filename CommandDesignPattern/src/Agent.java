/**
 * 
 * @author Cole Burnworth
 *
 */
import java.util.*;
public class Agent {
	private ArrayList<Command> orders;
	
	/**
	 * Initializes the array
	 */
	public Agent() {
		orders = new ArrayList<Command>(); 
	}
	
	/**
	 * The command is added to the array list of orders
	 * @param command
	 */
	public void placeOrder(Command command) {
		orders.add(command);
	}
	
	/**
	 * Loops through the list of orders and executes each one
	 */
	public void processOrders() {
		for (Command order : orders) {
			order.execute();
		}
	}
}
