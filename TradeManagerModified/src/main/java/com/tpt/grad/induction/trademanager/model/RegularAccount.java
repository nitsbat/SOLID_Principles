package com.tpt.grad.induction.trademanager.model;

import com.tpt.grad.induction.trademanager.interfaces.Account;

public class RegularAccount implements Account {

	@Override
	public float calculateFees(Trade trade) {
		float fees = (float) (trade.getQuantity() * 0.1);
		trade.setFees(fees);
		return fees;
	}

}
