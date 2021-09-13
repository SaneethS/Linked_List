package com.linkedlist;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to linked list");
		LinkedList list = new LinkedList();
		
//		list.push(70);
//		list.push(30);
//		list.push(56);
//		
//		list.print();
		
		list.append(56);
		list.append(30);
		list.append(70);
		
		list.print();
		
	}
}
