package com.hrishikesh.linkedlist;
/************************************************************
 * Purpose: Stack implementation using linked list.
 * 
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 12-06-2021
 *
 ************************************************************/
public class MyStack <E>{

	Node<E> top;
	int size;
	/**
	 * Pushes a element into stack
	 * @param data from user
	 */
	public void push(E data) {
		Node<E> newNode = new Node<>();
		newNode.data = data;
		newNode.next = null;
		newNode.next = top;
		top=newNode;
		size++;		
	}
}
	