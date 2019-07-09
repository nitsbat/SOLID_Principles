package com.tpt.grad.induction.trademanager.model;

public class BSE extends Exchange{

	public void CalculateFees(Trade t) {	
			if(t.getQuantity() <= 100) {
				t.setFees(200*t.getQuantity());
			}
			else {
				t.setFees(180*t.getQuantity());
			}
		
	}
}
