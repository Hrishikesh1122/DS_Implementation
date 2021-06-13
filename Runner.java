package com.hrishikesh.linkedlist;
/************************************************************
 * Purpose Linked List implementation
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 12-06-2021
 *
 ************************************************************/
public class Runner {

	public static void main(String[] args) {
		MyLinkedList numbers = new MyLinkedList();
		numbers.add(70);
		numbers.add(30);
		numbers.add(56);
		numbers.show();
		numbers.add(2,35);
		numbers.show();
	}

}
