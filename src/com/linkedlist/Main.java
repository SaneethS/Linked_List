package com.linkedlist;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to linked list");
		LinkedList list = new LinkedList();
		
		list.push(70);
		list.push(30);
		list.push(56);
		
		list.insertAtPos(3, 40);
		
		list.remove(40);
		
		list.print();
		
		System.out.println("\n"+list.search(30));
		
		System.out.println(list.size());
		
		
	}
}
