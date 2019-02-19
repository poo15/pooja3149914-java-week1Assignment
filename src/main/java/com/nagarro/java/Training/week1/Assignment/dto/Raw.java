/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.dto;


public class Raw extends Item {
	
	public Raw(String name, double price, int quantity) {
		super(name, price,quantity);
		this.getTax();
		this.getFinalPrice();
	}
	
	@Override
	public double getTax() {
		tax = (12.5 * super.getPrice() ) / 100;
		return tax;
	}
	
	@Override
	public double getFinalPrice() {
		finalPrice = super.getPrice()+super.getTax();
		return finalPrice;
	}
	
}
