package com.nagarro.java.Training.week1.Assignment.service.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nagarro.java.Training.week1.Assignment.constants.Constants;
import com.nagarro.java.Training.week1.Assignment.dto.Item;
import com.nagarro.java.Training.week1.Assignment.io.Input;

public class ItemServiceImpl implements ItemService {
	private List<Item> itemList = new ArrayList<>();
	@Override
	public List<Item> getAllItems() {
		Scanner scanner = new Scanner(System.in);
    	char wantToContinue;
    	do{
    	Input input = new Input();
    	Item item = input.inputItemDetails();
    	itemList.add(item);
    	System.out.println(Constants.ENTER_MORE_ITEMS);
    	wantToContinue = scanner.next().charAt(0);
    	} while(wantToContinue=='y');
    	scanner.close();
    	return itemList;
	}

	

}
