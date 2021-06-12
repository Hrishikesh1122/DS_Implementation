package com.hrishikesh.linkedlist;
/************************************************************
 * Purpose Linked List implementation
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 12-06-2021
 *
 ************************************************************/
public class MyLinkedList  {
	Node head;
	
	
	/**
	 * Purpose : To add elements to linked list
	 * @param data from main function
	 */
	public void add(int data) {
		Node newNode = new Node();
		newNode.data=data;
		
		if(head==null) {
			head = newNode;
		}
		else {
			Node node = head;
			while(node.next !=null) {
				node=node.next;
			}
			node.next=newNode;
		}
	}
	

}
