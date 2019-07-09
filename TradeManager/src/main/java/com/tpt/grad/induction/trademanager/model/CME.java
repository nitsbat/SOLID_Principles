package com.tpt.grad.induction.trademanager.model;

public class CME extends Exchange {

	@Override
	public void CalculateFees(Trade t) {
		
		if(t.getAcc_type() == Account_Type.Elite) {
			t.setFees(1200);
		}else {
			t.setFees(2000);
		}
		
	}

}
