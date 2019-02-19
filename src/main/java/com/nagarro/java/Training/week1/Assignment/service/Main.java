/*
* 
* @author pooja01 
* @version 0.0.1-SNAPSHOT
*/
package com.nagarro.java.Training.week1.Assignment.service;
import com.nagarro.java.Training.week1.Assignment.io.Output;
import com.nagarro.java.Training.week1.Assignment.service.interfaces.ItemServiceImpl;

public class Main 
{
   /**
     * Main method calls the Input class methods to take item details
     * 
     * @param args
     */
	public static void main( String[] args )
    {
		ItemServiceImpl itemServiecImpli = new ItemServiceImpl();
    	Output.showItemDetails(itemServiecImpli.getAllItems());
    }
}
