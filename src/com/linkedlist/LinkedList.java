package com.linkedlist;

/**class has been created to implement all the functions of linked list
 * @author saneeths
 *
 */
public class LinkedList {
	private Node head;
	private int size;
	
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
		size++;
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
		size++;
		return isAdded;
	}
	
	/**this method is created to insert the element at particular position
	 * @param pos
	 * @param data
	 */
	public void insertAtPos(int pos, int data) {
		Node newNode = new Node(data); 
		newNode.next = null;
		
		if(pos < 1) {
			System.out.println("Invalid position");
			return;
		}
		
		if(pos == 1) {
			push(data);
			size++;
		}else {
			Node temp;
		    temp = head;
		    for(int i = 1; i < pos-1; i++) {
		      if(temp != null) {
		        temp = temp.next;
		      }
		    }
		    if(temp != null) {
			      newNode.next = temp.next;
			      temp.next = newNode;  
			} else {
			   System.out.println("The previous node is null");
			}
		    size++;
		}
		
	}
	
	/**this method is created the values from the linked list
	 * @return
	 */
	public int pop() {
		if(head == null) {
			System.out.println("List is empty!!");
			return 0;
		}
		Node temp = head;
		head = temp.next;
		size--;
		return temp.data;
	}
	
	/**this method is created to pop the last element from the list
	 * @return
	 */
	public int popLast() {
		if(head == null) {
			System.out.println("List is empty!!");
			return 0;
		}
		if(head.next == null) {
			Node temp = head;
			head = null;
			size--;
			return temp.data;
		}
		
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		int data = temp.next.data;
		temp.next = null;
		size--;
		return data;
	}
	
	/**this method is created to check whether the particular value is present in the list
	 * return true if present otherwise false 
	 * @param element
	 * @return
	 */
	public boolean search(int element) {
		if(head == null) {
			System.out.println("List is empty");
			return false;
		}
		Node temp = head;
		boolean isFound = false;
		while(temp != null) {
			if(temp.data == element) {
				isFound =true;
				break;
			}
			temp = temp.next;
		}
		return isFound;
	}
	
	
	/**this method is created to remove the element from certain position
	 * @param element
	 * @return
	 */
	public boolean remove(int element) {
		if(!search(element)) {
			System.out.println("Data not found!!");
			return false;
		}
		Node temp = head;
		Node prev = null;
		if(temp != null && temp.data == element) {
			head =temp.next;
			size--;
			return true;
		}
	
			
		while(temp != null) {
			if(temp.data == element ) {
				size--;
				prev.next = temp.next;
				return true;
			}
			prev = temp;
			temp = temp.next;
		}
		
		return false;
	}
	
	/**method created find the size of the list
	 * @return
	 */
	public int size() {
		return this.size;
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
