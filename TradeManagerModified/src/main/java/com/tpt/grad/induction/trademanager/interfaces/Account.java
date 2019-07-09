package com.tpt.grad.induction.trademanager.interfaces;

import com.tpt.grad.induction.trademanager.model.Trade;

public interface Account {
	
	public float calculateFees(Trade trade);
}
