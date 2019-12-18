package com.spk.ds.test;

public class LinkedList {

	Node head;
	Integer length;

	public Object display(Node type) {
		return type.data;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void addNode(Object data) {
		if (data != null) {
			if (head == null) {
				head = new Node(data);
			} else {
				Node temp = head;
				while (temp.next != null) {

					temp = temp.next;
				}
				temp.next = new Node(data);
				// System.out.println(temp.next.data.toString());
			}
		}

	}

	public void displayList() {
		if (head != null) {
			Node temp = head;
			while (temp.next != null) {

				if (temp.next != null) {
					temp = temp.next;

				} else {
					break;
				}
				System.out.println(temp.data);
			}
		}

	}

	private class Node {

		Object data;
		Node next;

		public Node(Object data) {
			super();
			this.data = data;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
