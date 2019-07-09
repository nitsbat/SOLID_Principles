package com.tpt.grad.induction.trademanager.model;

public abstract class Exchange {
	
	public void Validate(Trade t) {
		
		if(t.getQuantity() > 1000) {
			System.out.println("Quantity exceeding 1000");
		}
	}
	
	public Trade save(Trade trade) {
		System.out.println("*****Trade Successfully Saved******");
		return trade;
	}
	
	public static void main(String args[]) {
		
		Trade obj = new Trade();
		
		obj.setId(10101L);
		obj.setContract("First_Contract");
		obj.setAcc_type("Regular");
		obj.setQuantity(20L);
		obj.setE("LME");
		
		switch (obj.getE()) {
		case BSE:	BSE op = new BSE();
					op.CalculateFees(obj);
					op.save(obj);
					break;
		case LME:	LME op1 = new LME();
					op1.CalculateFees(obj);
					op1.save(obj);
					break;
		case CME:	CME op2 = new CME();
					op2.CalculateFees(obj);
					op2.save(obj);
					break;
		}
		
		obj.PrintTrade();
	}
	
	
	public abstract void CalculateFees(Trade t);
}

