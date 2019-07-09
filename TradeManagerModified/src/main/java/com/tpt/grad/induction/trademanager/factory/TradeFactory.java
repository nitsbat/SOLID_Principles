package com.tpt.grad.induction.trademanager.factory;

import com.tpt.grad.induction.trademanager.model.AccountType;
import com.tpt.grad.induction.trademanager.model.BSEExchange;
import com.tpt.grad.induction.trademanager.model.CMEEliteExchange;
import com.tpt.grad.induction.trademanager.model.CMEExchange;
import com.tpt.grad.induction.trademanager.model.Exchange;
import com.tpt.grad.induction.trademanager.model.ExchangeType;
import com.tpt.grad.induction.trademanager.model.LMEExchange;

public class TradeFactory {

	public static Exchange getType(AccountType clientAccountType, ExchangeType exchangeType) {

		if (exchangeType.equals(ExchangeType.BSE)) {
			return new BSEExchange();
		}

		else if (exchangeType.equals(ExchangeType.LME)) {
			return new LMEExchange();
		}

		else if (exchangeType.equals(ExchangeType.CME)) {
			if (clientAccountType.equals(AccountType.ELITE)) {
				return new CMEEliteExchange();
			} else {
				return new CMEExchange();
			}
		}

		return null;
	}

}
