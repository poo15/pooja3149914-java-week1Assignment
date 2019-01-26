/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.service.interfaces;

import java.util.ArrayList;

import com.nagarro.java.Training.week1.Assignment.dto.Item;

public interface ItemService {
	
	 static ArrayList<Item> itemList=new ArrayList<Item>();

	 void calculateTax();
}
