package com.linkedlist;

/**class has been created to implement all the functions of linked list
 * @author saneeths
 *
 */
public class LinkedList {
	private Node head;
	
	/**nested class is created to implement node in linked list
	 * @author saneeths
	 *
	 */
	private class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	/**this method is created to add the values to the linked list
	 * @param data
	 */
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	/**this method appends the value to the linked list at the end
	 * @param data
	 * @return
	 */
	public boolean append(final int data) {
		boolean isAdded  = false;
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			isAdded  =true;
		}else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next  = newNode;
			isAdded = true;
		}
		return isAdded;
	}
	
	/**
	 * this is the method used to display the linked list
	 */
	public void print() {
		Node temp = head;
		
		System.out.println("LinkedList : ");
		
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
}
