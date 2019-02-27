package LinkedList;

public class LinkedList<E>{
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
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	
	
	public void add(E e,int index) {
		if(index<0&&index>size) {
			throw new IllegalArgumentException("索引错误");
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
	
	public void addFirst(E e) {
		add(e,0);
	}
	
	public void addLast(E e) {
		add(e,size);
	}
	
	//第一题
	public int Count(LinkedList h,int n) {
		
	    int N = 0;
		for(Node cur=dummyHead.next;cur!=null;cur=cur.next) {
			if(cur.e.equals(n)) {
				N++;
			}
		}
		
		return N;
	}
	
	//第二题
	public E GetNth(LinkedList list,int index) {
		if(index<0&&index>size) {
			throw new IllegalArgumentException("索引输入错误");
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
	
	//第三题
	public void DeleteList(LinkedList list) {
		for(Node cur=dummyHead.next;cur!=null;cur=cur.next ) {
			free(cur);
		}
		dummyHead.next=null;
		
	}
	
	//释放节点
	private void free(Node node) {
		node.e=null;
		node.next=null;
	}
	
	//第4题
	public E pop(LinkedList list) {
		Node cur=dummyHead.next;
		assert(cur!=null);
		E headNode=cur.e;
		dummyHead.next=cur.next;
		cur.next=null;
		free(cur);
		
		return headNode;
		
	}
	
	
	public void SortedInsert(LinkedList list) {
		Node cur=dummyHead.next;
		while(cur!=null) {
			if(((Comparable<E>) cur.e).compareTo(cur.next.e)>0) {
				swap(list,cur,cur.next);
			}
			cur=cur.next;
		}
	}
	
	private void swap(LinkedList list,Node i,Node j) {
		E n=i.e;
		i.e=j.e;
		j.e=n;
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
