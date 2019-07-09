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
	private Long quantity;
	private AccountType clientAccountType;
	private float fees;
	private ProductType t;
	
	
	public Trade(Long id, String contract, Long quantity, AccountType clientAccountType, ProductType t) {
		super();
		this.id = id;
		this.contract = contract;
		this.quantity = quantity;
		this.clientAccountType = clientAccountType;
		this.t = t;
	}
		
	public ProductType getProductType() {
		return t;
	}
	
	public void setProductType(ProductType a) {
		t = a;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	public AccountType getClientAccountType() {
		return clientAccountType;
	}

	public void setClientAccountType(AccountType clientAccountType) {
		this.clientAccountType = clientAccountType;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

}
