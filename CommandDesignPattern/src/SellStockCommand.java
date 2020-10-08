/**
 * 
 * @author Cole Burnworth
 *
 */
public class SellStockCommand implements Command {
	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	/**
	 * 
	 * @param stockTrade
	 * @param stockName
	 * @param shares
	 */
	
	public SellStockCommand(StockTrade stockTrade, String stockName, int shares) {
		this.stockTrade = stockTrade;
		this.stockName = stockName;
		this.shares = shares;
		
	}
	/**
	 * executes the selling of stock
	 */
	
	public void execute() {
		
		stockTrade.sell(stockName,shares);
		
	}
}
