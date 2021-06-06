package com.datastructures.linkedlist;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.insert(23);
		list.insert(34);
		list.insert(78);
		list.addElementAtStart(10);
		list.addElementAtStart(60);
		list.insertAt(4, 345);
		list.insertAt(2,56);
		list.deleteAt(3);
		list.show();
	}

}
