package com.tpt.grad.induction.trademanager.repo;

import com.tpt.grad.induction.trademanager.model.Trade;

public class Prime implements FeesCalculateAccType{

	public Long calFees(Trade t) {
		return 1200L;
	}
	
}
