/**
 * @author pooja01
 * 
 */
package com.nagarro.java.Training.week1.Assignment.io;

import java.util.*;

import com.nagarro.java.Training.week1.Assignment.constants.*;
import com.nagarro.java.Training.week1.Assignment.dto.*;
import com.nagarro.java.Training.week1.Assignment.validation.InputValidation;
public class Input {
	
	Scanner scanner = new Scanner(System.in);
	String itemName;
	String itemPrice;
	String itemType;
	String itemQuantity; 
	String namePriceType;
	InputValidation inputValidation = new InputValidation();
	
	/**
	 * Takes the input for item details in comma separated format and calls the
	 * functions for validate them.
	 * 
	 * @return Item  the object of item.
	 */
	
	public Item inputItemDetails(){
		
		System.out.println(Constants.ENTER_DEATILS); 
		
		while(true){
			namePriceType = scanner.nextLine();
			if(inputValidation.validateItemInputFormat(namePriceType)){
				break;
			} 
		}
		splitInputItemDetails(namePriceType);
		validateName();
		validatePrice();
		validateType();
		System.out.println(Constants.ENTER_QUANTITY);
		itemQuantity = scanner.nextLine();
		validateQuantity();
		return constructItemObject();
	}
	
	/**
	 * This function split the input item details by "," and assign then to variables
	 * 
	 * @param namePriceType   the namePriceType should be comma separated
	 */
	
	public void splitInputItemDetails(String namePriceType){
	
		String[] namePriceTypeSplit = namePriceType.split(",");
		itemName = namePriceTypeSplit[0];
		itemPrice = namePriceTypeSplit[1];
		itemType = namePriceTypeSplit[2];
	}
	
	/**
	 * This method continuously calls the validate Item Name function till 
	 *  valid item name
	 */
	
	public void validateName(){
		
		while(true){
			 if(inputValidation.validateItemName(itemName)) {
				  break;
			  } else {
				 itemName = scanner.nextLine();
			  }
		}
	}
	
	/**
	 * This method continuously calls the validate Item Price function till 
	 *  valid item Price
	 */
	
	public void validatePrice(){
		
		while(true){
			  if(inputValidation.validateItemPrice(itemPrice)) {
				  break;
			  } else {
				 itemPrice = scanner.nextLine();
			  }
		}
	}
	
	/**
	 * This method continuously calls the validate Item Type function till 
	 *  valid item type
	 */
	
	public void validateType(){
		
		while(true){
			  if(inputValidation.validateItemType(itemType)) {
				  break;
			  } else {
				 itemType = scanner.nextLine();
			  }
		}
	}
	
	/**
	 * This method continuously calls the validate Item Quantity function till 
	 *  valid item quantity
	 */
	
	public void validateQuantity(){
	
		while(true){
			  if(inputValidation.validateItemQuantity(itemQuantity)) {
				  break;
			  } else {
				  System.out.println(Constants.ENTER_QUANTITY);
				 itemQuantity = scanner.nextLine();
			  }
		}
    }
	
	/**
	 * This method create the item object according to the Item Type entered
	 * @return item the Item object 
	 */
   	
    public Item constructItemObject(){
    	Item item = new Item();   
	    switch(ItemType.valueOf(itemType.toUpperCase())){
	   
	    	case RAW:
	    		item = new Raw(itemName,Double.parseDouble(itemPrice),Integer.parseInt(itemQuantity)); 
	    		((Raw)item).calculateTax();
	    		break;
		   
		    case MANUFACTURED:
		    	item = new Manufactured(itemName,Double.parseDouble(itemPrice),Integer.parseInt(itemQuantity)); 
			    ((Manufactured)item).calculateTax();
				break;
		    
		    case IMPORTED:
		    	item = new Imported(itemName,Double.parseDouble(itemPrice),Integer.parseInt(itemQuantity)); 
				((Imported)item).calculateTax();
				break;
	   }
	   return item;
   }
}
