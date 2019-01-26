/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.dto;

import com.nagarro.java.Training.week1.Assignment.service.interfaces.ItemService;

public class Manufactured extends Item implements ItemService {
	
	public Manufactured(String name, double price, int quantity) {
		super(name, price,quantity);
	}
	
	/**
	 * Calculate the tax for the item type object
	 * and set the tax and final price for the item
	 */
	public void calculateTax(){
		double tax = (12.5 * getPrice() ) / 100;
		tax = tax + (2 * (getPrice() + tax)) / 100;
		setTax(tax);
		setFinalPrice(getTax() + getPrice());
	
	}
}
