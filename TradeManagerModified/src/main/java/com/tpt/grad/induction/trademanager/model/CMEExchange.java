package com.tpt.grad.induction.trademanager.model;

public class CMEExchange extends Exchange {

	@Override
	public float calculateFees(Trade trade) throws UnsupportedException {
		float fees = 0;
		if(trade.getProductType().equals(ProductType.FUTURE)) {
			fees=0;
		}
		else if(trade.getProductType().equals(ProductType.OPTION)) {
			fees=2;
		}
		else if(trade.getProductType().equals(ProductType.FORWARD)) {
			fees=(float) 0.5;
		}
		else {
			fees = -3;
			throw new UnsupportedException();
		}
		trade.setFees(fees);
		return fees;
	}
                                                                                     
}
