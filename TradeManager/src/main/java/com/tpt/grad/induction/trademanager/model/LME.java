package com.tpt.grad.induction.trademanager.model;

import com.tpt.grad.induction.trademanager.repo.EliteAcc;

public class LME extends Exchange{

	public void CalculateFees(Trade t) {
			
			//I have used the calFees of the EliteAcc() class as the fees are equal when calculated.
		
			EliteAcc obj = new EliteAcc();
			t.setFees(obj.calFees(t));
			
			//t.setFees(1000); // If in future the LME will different for different Account Type.
	}
	
}
