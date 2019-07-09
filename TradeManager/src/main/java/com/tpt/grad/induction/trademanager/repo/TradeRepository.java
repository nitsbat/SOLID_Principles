package com.tpt.grad.induction.trademanager.repo;
import com.tpt.grad.induction.trademanager.model.Trade;

public class TradeRepository {
	
	public static Trade save(Trade trade) {
		System.out.println("*****Trade Successfully Saved******");
		return trade;
	}

}
