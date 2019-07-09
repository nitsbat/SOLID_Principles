package com.tpt.grad.induction.trademanager.model;

public class ExceedingQuantityException extends Exception {
	
	ExceedingQuantityException(){
		System.out.println("ExceedingQuantityException: Quantity cannot be more than 1000 in a trade");
	}
}
