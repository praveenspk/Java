package com.spk.ds.test;

public class DoubleLinkedList<T> {

	Node head;
	Integer length;

	public void addData(T data) {
		if (data != null) {
			if (head == null) {
				head = new Node<T>(data);
				head.prev = null;
			} else {
				Node temp = head;

				while (temp.next != null) {
					temp = temp.next;
					
				}
				
				temp.next = new Node<T>(data);
				temp.next.prev=temp;
				
			}
		}
	}

	public void display() {
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

	private class Node<T> {
		T data;
		Node<T> next;
		Node<T> prev;

		public Node(T data) {
			super();
			this.data = data;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node<T> getPrev() {
			return prev;
		}

		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}

	}

}
