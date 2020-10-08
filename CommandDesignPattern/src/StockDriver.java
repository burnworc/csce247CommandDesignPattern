import java.util.Scanner;

public class StockDriver {
	Scanner in;
	
	public void runStockDriver() {
		in = new Scanner(System.in);

		StockTrade stock = new StockTrade();
		Agent agent = new Agent();

		while(true) {
			String command = getInputLine("Enter Command (b)uy, (s)ell, q(uit)").toLowerCase();
			if(command.contentEquals("q")) {
				break;
			}
			else if(command.contentEquals("b") || command.contentEquals("s")) {
				String stockName = getStockName();
				int stockNum = getNumStocks();
				if(stockName == null || stockName == "" || stockNum <= 0) {
					System.out.println("Invalid Data");
					continue;
				}
				
				if(command.contentEquals("b")) {
					agent.placeOrder(new BuyStockCommand(stock, stockName, stockNum));
				} else {
					agent.placeOrder(new SellStockCommand(stock, stockName, stockNum));
				}
				
			} else {
				System.out.println("Sorry that was an invalid command");
			}
		}
		
		System.out.println("Time to process all of the orders");
		agent.processOrders();
		
		System.out.println("Goodbye");
	}
	
	public String getStockName() {
		return getInputLine("Enter Stock Name");
	}
	
	public int getNumStocks() {
		String num = getInputLine("Enter Number of Stock");
		return Integer.parseInt(num);
	}
	
	private String getInputLine(String prompt) {
		System.out.print(prompt + ": ");
		return in.nextLine().toLowerCase().trim();
	}
	
	public static void main(String[] args) {
		StockDriver stockDriver = new StockDriver();
		stockDriver.runStockDriver();
	}
}
