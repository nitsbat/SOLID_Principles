package com.tpt.grad.induction.trademanager.repo;

import com.tpt.grad.induction.trademanager.model.Trade;


public class CalculateTrade {
	

	public void calculateFees(Trade t) {
		
//		op = t.getAcc_type();
		
		switch (t.getAcc_type()) {
		case Elite:
			EliteAcc op = new EliteAcc();
			t.setFees(op.calFees(t));
			break;
		case Prime:
			Prime op1 = new Prime();
			t.setFees(op1.calFees(t));
			break;
		case Regular:
			Regular op2 = new Regular();
			t.setFees(op2.calFees(t));
			break;

		default:
			System.out.println("Please enter a valid Account type");
		}
	}
}
