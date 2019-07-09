package com.tpt.grad.induction.trademanager.model;

public class BSEExchange extends Exchange {

	@Override
	public float calculateFees(Trade trade) {
		float fees = 200000;
		if(trade.getQuantity() <= 100) {
			fees = (float) (trade.getQuantity() * 0.2);
		}
		else {
			fees = (float) (trade.getQuantity() * 0.18);
		}
		trade.setFees(fees);
		return fees;
	}

}
