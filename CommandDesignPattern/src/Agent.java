/**
 * 
 * @author Cole Burnworth
 *
 */
import java.util.*;
public class Agent {
	private ArrayList<Command> orders;
	
	public Agent() {
		orders = new ArrayList<Command>(); 
	}
	
	public void placeOrder(Command command) {
		orders.add(command);
	}
	
	public void processOrders() {
		for (Command order : orders) {
			order.execute();
		}
	}
}
