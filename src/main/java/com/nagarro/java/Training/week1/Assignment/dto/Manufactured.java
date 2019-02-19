/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.dto;


public class Manufactured extends Item {
	
	public Manufactured(String name, double price, int quantity) {
		super(name, price,quantity);
		this.getTax();
		this.getFinalPrice();
	}
	
	@Override
	public double getTax() {
		double taxResult = (12.5 * getPrice() ) / 100;
		tax = taxResult + (2 * (getPrice() + tax)) / 100;
		return tax;
	}
	
	@Override
	public double getFinalPrice() {
		finalPrice = super.getPrice()+super.getTax();
		return finalPrice;
	}
	
	
}
