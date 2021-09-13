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
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public void print() {
		Node temp = head;
		
		System.out.println("LinkedList : ");
		
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
}
