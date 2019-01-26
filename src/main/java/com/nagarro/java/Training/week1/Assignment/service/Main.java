/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.service;
import java.util.Scanner;
import com.nagarro.java.Training.week1.Assignment.constants.Constants;
import com.nagarro.java.Training.week1.Assignment.dto.Item;
import com.nagarro.java.Training.week1.Assignment.io.Input;
import com.nagarro.java.Training.week1.Assignment.io.Output;
import com.nagarro.java.Training.week1.Assignment.service.interfaces.ItemService;

public class Main 
{
   /**
     * Main method calls the Input class methods to take item details
     * 
     * @param args
     */
	public static void main( String[] args )
    {
		Scanner scanner = new Scanner(System.in);
    	char wantToContinue;
    	do{
    	Input input = new Input();
    	Item item = input.inputItemDetails();
    	ItemService.itemList.add(item);
    	System.out.println(Constants.ENTER_MORE_ITEMS);
    	wantToContinue = scanner.next().charAt(0);
    	} while(wantToContinue=='y');
    	scanner.close();
    	Output.showItemDetails();
    }
}
