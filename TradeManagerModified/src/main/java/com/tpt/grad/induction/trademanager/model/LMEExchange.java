package com.tpt.grad.induction.trademanager.model;

public class LMEExchange extends Exchange {

	@Override
	public float calculateFees(Trade trade) {
		
		float fees =10;
		trade.setFees(fees);
		return fees;
	}

}
