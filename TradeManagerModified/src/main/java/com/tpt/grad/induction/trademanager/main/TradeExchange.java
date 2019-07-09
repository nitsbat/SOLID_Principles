package com.tpt.grad.induction.trademanager.main;

import com.tpt.grad.induction.trademanager.factory.TradeFactory;
import com.tpt.grad.induction.trademanager.model.AccountType;
import com.tpt.grad.induction.trademanager.model.ExceedingQuantityException;
import com.tpt.grad.induction.trademanager.model.Exchange;
import com.tpt.grad.induction.trademanager.model.ExchangeType;
import com.tpt.grad.induction.trademanager.model.ProductFactory;
import com.tpt.grad.induction.trademanager.model.ProductType;
import com.tpt.grad.induction.trademanager.model.Trade;

public class TradeExchange {

	public static void main(String[] args) {
		
		Trade trade1 = new Trade(0000001L, "Contract-1", 80L, AccountType.ELITE,ProductType.FUTURE);
		Exchange exchange1 = ProductFactory.getProductType(ExchangeType.NIMEX,trade1.getProductType());
		//TradeFactory.getType(trade1.getClientAccountType(), ExchangeType.CME);
		try {
			trade1 = exchange1.calculate(trade1,ExchangeType.NIMEX);
		} catch (ExceedingQuantityException e) {
		}

	}

}
