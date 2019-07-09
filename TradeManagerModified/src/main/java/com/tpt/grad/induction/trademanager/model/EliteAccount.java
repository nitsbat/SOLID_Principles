package com.tpt.grad.induction.trademanager.model;

import com.tpt.grad.induction.trademanager.interfaces.Account;

public class EliteAccount implements Account {

	@Override
	public float calculateFees(Trade trade) {
		float fees = 1;
		trade.setFees(fees);
		return fees;
	}

}
