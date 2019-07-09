package com.tpt.grad.induction.trademanager.model;

public abstract class Exchange {

	public Trade calculate(Trade trade,ExchangeType tmp) throws ExceedingQuantityException{

		if(trade.getQuantity() > 1000) {
			throw new ExceedingQuantityException();
		}
		else {
			try {
				calculateFees(trade);
			} catch (UnsupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return save(trade,tmp);
		}
		
	}

	public static Trade save(Trade trade, ExchangeType exchangeType) {
		
		if(trade.getFees() < 0) {
			System.out.println("");
		}
		else {
			System.out.println( exchangeType + " saved with fees = "
					+ trade.getFees()+" on "+trade.getProductType()+" type of Product.");
		}
		
		return trade;
	}

	public abstract float calculateFees(Trade trade) throws UnsupportedException;

}
