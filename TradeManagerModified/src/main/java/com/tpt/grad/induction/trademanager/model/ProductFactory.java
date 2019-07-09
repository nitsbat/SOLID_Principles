package com.tpt.grad.induction.trademanager.model;

public class ProductFactory {
	
	public static Exchange getProductType(ExchangeType exchangeType,ProductType productType) {
		try {
			if(exchangeType != null) {
				switch(exchangeType) {
				case LME :	return new LMEExchange();
				case CME : 	return new CMEExchange();
				case BSE :	return new BSEExchange();
				default :	return new DefaultExchange();
				}
			}else {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("Exchange Type is null");
			return null;
		}
		
		
	}

}
