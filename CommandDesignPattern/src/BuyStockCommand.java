/**
 * 
 * @author Jerald Capilo
 *
 */
public class BuyStockCommand implements Command {
	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	/**
	 * Simple constructor that sets attributes for the trade
	 * @param stockTrade
	 * @param stockName
	 * @param shares
	 */
	public BuyStockCommand(StockTrade stockTrade, String stockName, int shares) {
		this.stockTrade = stockTrade;
		this.stockName = stockName;
		this.shares = shares;	
	}
	
	/**
	 * Calls upon the stockTrade class method buy() to purchase a stock and the amount based on the parameters
	 */
	public void execute() {
		stockTrade.buy(stockName, shares);
	}
}
