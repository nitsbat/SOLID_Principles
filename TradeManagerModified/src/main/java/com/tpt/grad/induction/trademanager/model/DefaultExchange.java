package com.tpt.grad.induction.trademanager.model;

public class DefaultExchange extends Exchange{

	@Override
	public float calculateFees(Trade trade) throws UnsupportedException{
		// TODO Auto-generated method stub
		float fees = (float) 0.5;
		try {
			if(trade.getProductType().equals(ProductType.FORWARD)) {
				fees = (float) 0.5;
			}else {
				throw new UnsupportedException();
			}
		}catch(Exception e) {
			
		}
		fees = -3;
		trade.setFees(fees);
		return fees;
	}

}
