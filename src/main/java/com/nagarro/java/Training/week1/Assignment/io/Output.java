/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.io;

import com.nagarro.java.Training.week1.Assignment.service.interfaces.ItemService;

public class Output {

	/**
	 * This method print all the items of the list
	 */
	
	public static void showItemDetails() {
		
		ItemService.itemList.forEach(item -> System.out.println(item));
		
	}
}
