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
	
	/**
	 * Pop : Deletes the top element of stack
	 */
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			System.exit(0);
		}
		top=top.next;
		size--;
	}
	
	/**
	 * @return size of stack
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Tells if stack is empty or not
	 * True if empty , false otherwise
	 * @return boolean
	 */
	public boolean isEmpty() {
		return size ==0;
	}
}
	