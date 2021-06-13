package com.hrishikesh.linkedlist;

/************************************************************
 * Purpose Linked List implementation
 * 
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 12-06-2021
 *
 ************************************************************/
public class MyLinkedList {
	Node head;

	/**
	 * Purpose : To add elements to linked list
	 * 
	 * @param data from main function
	 */
	public void add(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	/**
	 * Method to add element at an index
	 * 
	 * @param index
	 * @param data
	 */
	public void add(int index, int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			Node temp = head;
			for (int i = 0; i < (index - 1); i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}

	}

	/**
	 * Method to delete first element of linked list
	 */
	public void deleteFirst() {
		head = head.next;
	}

	/**
	 * Method to delete last element
	 */
	public void deleteLast() {
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;

	}

	/**
	 * Delete the element based on its index value in linked list
	 * @param index of the element to be deleted
	 */
	public void delete(int index) {
		if (index == 0) {
			deleteFirst();
		} else {
			Node temp = head;
			Node temp1 = null;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			temp1 = temp.next;
			temp.next = temp1.next;
		}
	}

	/**
	 * Check if element is present in linked list or not
	 * 
	 * @param element to find in linked list Prints index at which element is found
	 */
	public void find(int element) {
		Node temp = head;
		boolean check = true;
		int i = 0;
		while (temp.next != null) {
			if (temp.data == element) {
				System.out.println("Found " + element + " at index " + i);
				check = false;
				break;
			} else {
				i++;
			}
			temp = temp.next;
		}
		while (check) {
			i++;
			if (temp.data == element) {
				System.out.println("Found " + element + " at index " + i);
			} else {
				System.out.println("Not found");
			}
			check = false;
		}
	}

	/**
	 * Method to print all elements of linked list
	 */
	public void show() {
		Node temp = head;
		System.out.println();
		System.out.print("[ ");
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + " ]");
	}

}
