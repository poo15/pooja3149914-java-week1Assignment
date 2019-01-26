/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.validation;

import com.nagarro.java.Training.week1.Assignment.constants.Constants;
import com.nagarro.java.Training.week1.Assignment.dto.ItemType;
import com.nagarro.java.Training.week1.Assignment.exception.ItemInputException;

public class InputValidation {
	
	boolean validationFlag=true;
	
	/**
	 * This methods checks namePriceType contains the three values
	 * 
	 * @param namePriceType the string to split by "," and
	 * 						check length is 3
	 * @return boolean
	 */
	public boolean validateItemInputFormat(String namePriceType){
		
		try{
			if(namePriceType.split(",").length != 3){
				throw new ItemInputException(Constants.ENTER_DEATILS);
			}
		} catch(ItemInputException itemInputFormatException) {
			System.out.println(itemInputFormatException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * This method checks that item name contains only alphabets
	 * 
	 * @param itemName  the string to validate item name
	 * 
	 * @return boolean
	 */
	public boolean validateItemName(String itemName){
		
		try{
			if(! itemName.matches( "[a-zA-Z]+" )){
				throw new ItemInputException(Constants.VALID_NAME);
			}
		} catch(ItemInputException itemNameException){
			System.out.println(itemNameException.getMessage());
			return false;
		}
		
		return true;
	}
	
	/**
	 * Method checks that item price is numeric and greater than 0
	 * 
	 * @param itemPrice the string to parse in Double and validate
	 * 
	 * @return boolean
	 */
	public boolean validateItemPrice(String itemPrice){
			
			try {
				if(Double.parseDouble(itemPrice) <= 0){
					throw new ItemInputException(Constants.VALID_PRICE);
				}
			} catch(ItemInputException itemPriceException){
				System.out.println(itemPriceException.getMessage());
				return false;
			} catch(NumberFormatException itemQuantityException){
				System.out.println(Constants.VALID_PRICE);
				return false;
			}
		    return true;
	}
	
	/**
	 * Method checks that item type is defined as constant in ENUM
	 * 
	 * @param itemType the string use to get the name of ENUM
	 * 
	 * @return boolean
	 */
	public boolean validateItemType(String itemType){
		
		for(ItemType itemTypee : ItemType.values()){	
			if(itemTypee.name().equalsIgnoreCase(itemType)) {
				validationFlag = true;
				break;
			} else {
				validationFlag = false;
			}
		}
		 
		try{
			if(!validationFlag){
				throw new ItemInputException(Constants.VALID_TYPE);
			}
		} catch(ItemInputException itemTypeException){
			System.out.println(itemTypeException.getMessage());
		   }
		return validationFlag;
	}
	
	/**
	 * Method checks that item quantity is positive integer
	 *
	 * @param itemPrice the string to parse in Integer and validate
	 * 
	 * @return boolean
	 */
	public boolean validateItemQuantity(String itemQuantity){	
		try {
		    if(Integer.parseInt(itemQuantity) < 0){
				throw new ItemInputException(Constants.VALID_QUANTITY);
			}
		} catch(ItemInputException itemQuantityException){
			System.out.println(itemQuantityException.getMessage());
			return false;
		} catch(NumberFormatException itemQuantityException){
			System.out.println(Constants.VALID_QUANTITY);
			return false;
		}
	    return true;
	}

}
