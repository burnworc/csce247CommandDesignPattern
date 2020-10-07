/**
 * 
 * @author Cole Burnworth
 *
 */
import java.util.*;
public class Agent {
	private ArrayList<Command> orders;
	
	public Agent() {
<<<<<<< HEAD
		orders = new ArrayList<Command>(); 
=======
		system.out.print("");
		
>>>>>>> 0664454a833aeb4386b74b66e21adf2a98e2b4cd
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
