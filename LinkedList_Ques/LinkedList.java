package LinkedList_Ques;

public class LinkedList{
	private class Node{
		int data;
		Node next;
		Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
	}
	Node head;
	Node tail;
	int size;

	public LinkedList(){
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	public int size()
	{
		return this.size;
	}
	public boolean isEmpty(){
		return this.size() == 0;
	}

	public void addFirst(int data)
	{
		Node node = new Node(data, this.head);
		this.head = node;
		if (this.isEmpty()) {
			this.tail = node;
		}
		this.size++;
	}

	public void addLast(int data){
		Node node = new Node(data, null);
		if (this.isEmpty()) {
			this.head = node;
			this.tail = node;
		}
		else{
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}

	private Node getNodeAt(int index) throws Exception{
		if (index<0||index>=this.size) {
			throw new Exception("Invalid Index");
		}
		Node temp = this.head;
		int counter = 0;
		while(counter<index){
			temp = temp.next;
			counter++; 
		}
		return temp;
	}

	public void addAt(int index, int data) throws Exception{
		if (index<0 || index > this.size) {
			throw new Exception("Invalid Index");
		}

		if (index==0) {
			this.addFirst(data);
		}
		else if (index == this.size) {
			this.addLast(data);
		}
		else{
			Node temp = this.getNodeAt(index - 1);
			Node node = new Node(data, temp.next);
			temp.next= node;
			this.size++;
		}
	}

	public int getFirst() throws Exception{
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		return this.head.data;
	}

	public int getLast() throws Exception{
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		return this.tail.data;
	}

	public int getAt(int index) throws Exception{
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (index < 0 || index>= this.size ) {
			throw new Exception("Invalid Index");
		}

		return this.getNodeAt(index).data;
	}

	public int removeFirst() throws Exception{
		if (this.isEmpty()) {
			throw new Exception("List Empty");
		}

		Node t = this.head;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		}
		else {
			this.head = this.head.next;
		}
		this.size--;
		return t.data;
	}

	public int removeLast() throws Exception{
		if (this.isEmpty()) {
			throw new Exception("List Empty");
		}

		Node t = this.tail;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		}
		else {
			Node temp = this.getNodeAt(this.size - 2);
			temp.next = null;
			this.tail = temp;
		}

		this.size--;
		return t.data;
	}

	public int removeAt(int index) throws Exception{
		if (this.isEmpty()) {
			throw new Exception("List Empty");
		}
		if (index<0 || index>=this.size) {
			throw new Exception("Invalid Index");			
		}

		if (index == 0) {
			return this.removeFirst();
		}
		else if (index == this.size - 1) {
			return this.removeLast();
		}
		else{
			Node temp = this.getNodeAt(index - 1);
			Node removed = temp.next;
			temp.next = removed.next;
			this.size--;
			return removed.data;
		}	
	}

	public void reversePR(){// Recursively reversing Linked List
		this.reversePR(this.head);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next=null;
	}

	private void reversePR(Node node){
		
		if (this.tail == node) {
			return;
		}

		reversePR(node.next);
		node.next.next = node; 
		// imagine a stack, the last element is pooped and call was given by 2nd last element,
		// 2nd last element is node here and its next is last element and its next is last element pointing at null
		// which is change to node here which is 2nd last element, this means now last element is pointing toeards 2nd last element ans so on.

	}

	public void reversePI(){// Reversing iteratively
		
		
	}
/*
	public void reversePI(){
		Node t1 = node;
		Node t =  node.next;
		Node t2 = node.next.next;
		for (int i = 1; i< this.size ;i++) 
		{
			t.next = t1;
			t1 = t;
			t = t2;
			if (i != (this.size -1)) {
			t2 = t2.next;	
			}		
		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next=null;
	}
	*/
	
	public void reversePIL()
	{
	Node prev = this.head;
	Node curr = prev.next;
		
		while(curr!=null)
		{
			Node tprev = prev;
			Node tcurr = curr;
			prev = curr;
			curr= curr.next;
			tcurr.next = tprev;
			Node temp = this.head;
			this.head = this.tail;
			this.tail = temp;
			this.tail.next=null;
		}
	}

	public void display(){
		Node temp = this.head;
		while(temp!=null){
			System.out.print(temp.data +" -> ");
			temp = temp.next;
		}
		System.out.print("End" + "\n");


	}

} 