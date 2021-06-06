package com.datastructures.linkedlist;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void show() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

	public void addElementAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}

	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		if (index == 0) {
			addElementAtStart(data);
		} else {
			Node n = head;
			for (int i = 1; i < index; i++) {
				n = n.next;
			}

			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		Node n = head;

		if (index == 0) {
			head = head.next;
		} else {
			for (int i = 0; i < index; i++) {
				n = n.next;
			}

			Node n1 = n.next;
			n.next = n1.next;
			n1.next = null;
		}
	}

}
