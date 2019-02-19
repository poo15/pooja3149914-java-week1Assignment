/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.dto;

public class Imported extends Item{

	public Imported(String name, double price, int quantity) {
		super(name, price,quantity);
		this.getTax();
		this.getFinalPrice();
	}
	
	@Override
	public double getTax() {
		double cost = ( 10 * getPrice() ) / 100;
		double taxCal;
		if(cost <= 100) {
			taxCal = cost + 5;
		} else if(cost > 100 && cost <= 200) {
			taxCal = cost + 10;
		} else {
			taxCal = cost + (10 * ( cost + getPrice() )) / 100;
		}
		tax = taxCal;
		return tax;
	}
	
	@Override
	public double getFinalPrice() {
		finalPrice = super.getPrice()+super.getTax();
		return finalPrice;
	}
	
}
