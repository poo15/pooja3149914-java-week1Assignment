/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.exception;

public class ItemInputException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ItemInputException(String userInputException){
		super(userInputException);
	}
}
