/**
 * 
 * @author Cole
 *
 */
public class StockTrade {
	public StockTrade() {}
	
	public void buy(String stockName, int numShares) {
		System.out.println("Buying " + numShares + " of" + stockName);
	}
	
	public void sell(String stockName, int numShares) {
		System.out.println("Selling " + numShares + " of" + stockName);
	}
}
