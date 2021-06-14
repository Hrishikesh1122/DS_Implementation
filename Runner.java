package com.hrishikesh.linkedlist;
/************************************************************
 * Purpose : Linked List implementation
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 12-06-2021
 *
 ************************************************************/
public class Runner {

	public static void main(String[] args) {
		MyLinkedList<Integer> numbers = new MyLinkedList<>();
		numbers.addAtStart(70);
		numbers.addAtStart(30);
		numbers.addAtStart(56);
		numbers.show();
		System.out.println();
		numbers.add(70);
		numbers.add(30);
		numbers.add(56);
		numbers.add(85);
		numbers.add(4,49);
		numbers.find(30);
		numbers.show();
		System.out.println();
		numbers.delete(1);
		numbers.add(54);
		numbers.add(1);
		numbers.show();
		numbers.sort();
		numbers.show();
		
		MyLinkedList<String> strings = new MyLinkedList<>();
		strings.add("Hello");
		strings.add("World");
		strings.add("!!!");
		strings.show();
		System.out.println();
		strings.find("Hello");
		strings.sort();	
		strings.show();
		System.out.println();
		
		MyStack<Integer> stack = new MyStack<>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		System.out.println(stack.size());
		stack.pop();	
		System.out.println(stack.size());
		
	}

}
