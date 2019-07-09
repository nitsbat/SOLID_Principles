package com.tpt.grad.induction.trademanager.model;

import com.tpt.grad.induction.trademanager.interfaces.Account;

public class PrimeAccount implements Account {

	@Override
	public float calculateFees(Trade trade) {
		float fees = (float) 1.2;
		trade.setFees(fees);
		return fees;
	}

}
