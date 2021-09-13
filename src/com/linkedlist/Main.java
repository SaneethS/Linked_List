package com.linkedlist;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to linked list");
		LinkedList list = new LinkedList();
		
		list.push(70);
		list.push(56);
		
		list.insertAtPos(2, 30);
		
		list.print();
		
		System.out.println("\n"+list.search(30));
		
		
	}
}
