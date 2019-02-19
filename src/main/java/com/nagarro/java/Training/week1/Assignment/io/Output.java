/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.io;

import java.util.List;

import com.nagarro.java.Training.week1.Assignment.dto.Item;

public class Output {

	/**
	 * This method print all the items of the list
	 */
	
	public static void showItemDetails(List<Item> items) {
		
		items.forEach(item -> System.out.println(item));
		
	}
}
