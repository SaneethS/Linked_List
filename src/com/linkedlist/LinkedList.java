package com.linkedlist;

public class LinkedList {
	private Node head;
	private int size;
	
	private class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
}
