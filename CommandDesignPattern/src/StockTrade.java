/**
 * 
 * @author Cole Burnworth, Jerad Capilo, Jonathan Brown
 *
 */
public class StockTrade {
	public StockTrade() {}
	
	/**
	 * Calling the buy method displays the number of stocks being purchased and what the name of the stocks are
	 * @param stockName - takes in the name of the stock being purchased
	 * @param numShares - takes in the number of shares being purchased
	 */
	public void buy(String stockName, int numShares) {
		System.out.println("Buying " + numShares + " of" + stockName);
	}
	
	/**
	 * Calling the sell method dsiplays the number of shares being sold and the name of the stocks
	 * @param stockName - Takes in the name of the stocks being sold
	 * @param numShares - Takes in the number of shares being sold
	 */
	public void sell(String stockName, int numShares) {
		System.out.println("Selling " + numShares + " of" + stockName);
	}
}
