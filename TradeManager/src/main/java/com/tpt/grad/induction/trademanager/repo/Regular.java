package com.tpt.grad.induction.trademanager.repo;

import com.tpt.grad.induction.trademanager.model.Trade;

public class Regular implements FeesCalculateAccType{

	public Long calFees(Trade t) {
		return t.getQuantity()*1000;
	}
	
}
