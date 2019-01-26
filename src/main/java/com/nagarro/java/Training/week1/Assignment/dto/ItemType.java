/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.dto;

public enum ItemType {
	RAW("Raw"),
	MANUFACTURED("Manufactured"),
	IMPORTED("Imported");
	
	private String itemTypeValue;
	
	private ItemType(String itemTypeValue){
		this.itemTypeValue = itemTypeValue;
	}

	public String getItemTypeValue() {
		return itemTypeValue;
	}

	public void setItemTypeValue(String itemTypeValue) {
		this.itemTypeValue = itemTypeValue;
	}
}
