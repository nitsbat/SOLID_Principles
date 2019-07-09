package com.tpt.grad.induction.trademanager.model;

public class CMEEliteExchange extends Exchange {

	@Override
	public float calculateFees(Trade trade) {
		float fees = 1.2f;
		trade.setFees(fees);
		return fees;
	}

}
