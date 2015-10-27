package com.example.eventbus;

import java.util.ArrayList;
import java.util.List;

public class Item {

	public String id;
	public String content;
	
	public static List<Item> ITEMS = new ArrayList<Item>();
	
	static {
		addItem(new Item("1","Item 1"));
		addItem(new Item("2","Item 2"));
		addItem(new Item("3","Item 3"));
		addItem(new Item("4","Item 4"));
		addItem(new Item("5","Item 5"));
		addItem(new Item("6","Item 6"));
	}

	public Item(String id, String content) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.content = content;
	}

	private static void addItem(Item item) {
		// TODO Auto-generated method stub
		ITEMS.add(item);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return content;
	}
}
