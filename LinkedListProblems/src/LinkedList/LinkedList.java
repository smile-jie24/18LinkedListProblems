package LinkedList;

public class LinkedList<E extends Comparable<E>>{
	private class Node{
		public E e;
		public Node next;
		
		public Node(E e, Node next) {
			this.e=e;
			this.next=next;
		}
		
		public Node(E e) {
			this(e,null);
		}
		
		public Node() {
			this(null,null);
		}
		
		@Override
		public String toString() {
			return e.toString();
		}
	}
	
	private Node dummyHead;
	
	private int size;
	
	public LinkedList() {
		dummyHead=new Node(null,null);
		size=0;
	}
	
	public Node createNode(E e) {
		Node node=new Node(e);
		return node;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
		
	/*
	 * Add node
	 * 5-add() Solution
	 */
	public void add(E e,int index) {
		if(index<0&&index>size) {
			throw new IllegalArgumentException("Ë÷Òý´íÎó");
		}
		
			Node prev=dummyHead;
			for(int i=0;i<index;i++) {
				prev=prev.next;
			}
			
			Node node=new Node(e);
			node.next=prev.next;
			prev.next=node;

			//prev.next=new Node(e,prev.next);
			size++;
	}
	
	
	private void add2(E e,int index) {
		
			
	}
	
	//First add node
	public void addFirst(E e) {
		add(e,0);
	}
	
	//Last add node
	public void addLast(E e) {
		add(e,size);
	}
	
	//1-Count() Solution
	public int Count(LinkedList h,int n) {
		
	    int N = 0;
		for(Node cur=dummyHead.next;cur!=null;cur=cur.next) {
			if(cur.e.equals(n)) {
				N++;
			}
		}
		
		return N;
	}
	
	//2-GetNth() Solution
	public E GetNth(LinkedList list,int index) {
		if(index<0&&index>size) {
			throw new IllegalArgumentException("Ë÷ÒýÊäÈë´íÎó");
		}
		Node cur=dummyHead.next;
		int N=0;
		while(cur!=null) {
			if(N==index) {
				return cur.e; 
			}
			cur=cur.next;
			N++;
		}
		return null;
	}
	
	//3-DeleteList() Solution
	public void DeleteList(LinkedList list) {
		for(Node cur=dummyHead.next;cur!=null;cur=cur.next ) {
			free(cur);
		}
		dummyHead.next=null;
		
	}
	
	//Release node
	private void free(Node node) {
		node.e=null;
		node.next=null;
	}
	
	//4-pop() Solution
	public E pop(LinkedList list) {
		Node cur=dummyHead.next;
		assert(cur!=null);
		E headNode=cur.e;
		dummyHead.next=cur.next;
		cur.next=null;
		free(cur);	
		return headNode;		
	}
	
	//6-SortedInsert() Solution
	public void SortedInsert(LinkedList list,Node newNode) {
		Node cur=dummyHead.next;
		if(cur==null||cur.e.compareTo(newNode.e)<=0) {
			newNode.next=cur;
			dummyHead.next=newNode;
		}else {
			while(cur!=null&&cur.next.e.compareTo(newNode.e)>0) {
				cur=cur.next;
			}
			newNode.next=cur.next;
			cur.next=newNode;
		}
	}
	
	//6-SortedInsert()2 Solution
	public void SortedInsert2(LinkedList list,Node newNode) {
		Node cur=dummyHead;
		while(cur!=null&&cur.next.e.compareTo(newNode.e)>0) {
			cur=cur.next;
		}
		newNode.next=cur.next;
		cur.next=newNode;
		cur=dummyHead.next;
	}
	
	@Override
	public String toString() {
		StringBuilder s=new StringBuilder();
		Node cur=dummyHead.next;		
		while(cur!=null) {
			s.append(cur+"-->");
			cur=cur.next;
		}
		s.append("Null");
		return s.toString();		
	}
	
	
}
