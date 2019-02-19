/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.dto;

public class Item {
	
	private String name;
	private double price;
	private int quantity;
	protected double tax;
	protected double finalPrice;
	
	public Item() {}
	
	public Item(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	@Override
	public String toString() {
		return "Name:- "+this.name+"\t\t Price:- "+this.price+"\t\t Sales Tax:- "+
				this.tax+"\t\t Final cost:- "+this.finalPrice;
	}
	
}
