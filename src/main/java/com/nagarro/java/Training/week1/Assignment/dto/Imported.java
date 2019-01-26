/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.dto;

import com.nagarro.java.Training.week1.Assignment.service.interfaces.ItemService;

public class Imported extends Item implements ItemService{

	public Imported(String name, double price, int quantity) {
		super(name, price,quantity);
	}
	
	/**
	 * Calculate the tax for the item type object
	 * and set the tax and final price for the item
	 */
	public void calculateTax(){
		double cost = ( 10 * getPrice() ) / 100;
		double tax;
		if(cost <= 100) {
			tax = cost + 5;
		} else if(cost > 100 && cost <= 200) {
			tax = cost + 10;
		} else {
			tax = cost + (10 * ( cost + getPrice() )) / 100;
		}
		setTax(tax);
		setFinalPrice(getTax() + getPrice());
	
	}
}
