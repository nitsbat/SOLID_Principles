/**
 * 
 */
package com.tpt.grad.induction.trademanager.model;


/**
 * @author bhavik.banchpalliwar
 *
 */

public class Trade {
	
	private Long id;
	
	private String contract;	
	
	private float fees;
	
	private Long quan;
	
	Account_Type t;
	
	ExchangeType e;
	
	public ExchangeType getE() {
		return e;
	}

	public void setE(String s) {
		if(s.equals("BSE")) {
			e = ExchangeType.BSE;
		}
		else if(s.equals("LME")) {
			e = ExchangeType.LME;	
		}
		else {
			e = ExchangeType.CME;	
		}
	}


	
	
	public Account_Type getAcc_type() {
		return t;
	}
	
	public void setAcc_type(String acc) {
		if (acc.equals("Elite"))
			t = Account_Type.Elite;
		else if (acc.equals("Prime"))
			t = Account_Type.Prime;
		else
			t = Account_Type.Regular;
	}


	public Long getQuantity() {
		return quan;
	}

	public void setQuantity(Long quantity) {
		this.quan = quantity;
	}
	
	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public void PrintTrade() {
		System.out.println("\nDetails Of Trade\n");
		System.out.println("Id : "+this.getId()+"\nContract : "+contract+"\nQuantity : "+this.getQuantity()+"\nAccount_type : "+t+ "\nType Of Exchange : "+e+
				"\nTotal Fees : "+this.getFees());
	}
}
