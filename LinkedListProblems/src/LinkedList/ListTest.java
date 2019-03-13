package LinkedList;

public class ListTest {
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList<Integer>();
	
		//形成默认的测试链表
		for(int i=0;i<4;i++) {
			list.addFirst(i);
			//System.out.println("insert"+"'"+i+"'"+"success:  "+list);
		}
		
		//1-Count() Test
		/*
		System.out.print("1-Count()测试结果：");
		int a=list.Count(list, 2);
		System.out.println(a);
		*/
		
		//2-GetNth() Test
		/*
		System.out.print("2-GetNth()测试结果:");
		System.out.println(list.GetNth(list, 2));
		*/
		 
		//3-DeleteList() Test
		/*
		System.out.println("3-DeleteList()测试结果：");
		System.out.print("DeleteList()前的链表为：");
		System.out.println(list);
		list.DeleteList(list);
		System.out.print("DeleteList()后的链表为：");
		System.out.println(list);
		*/
	
		
		//4-pop() Test
		/*
		System.out.println("4-pop()测试结果");
		System.out.print("pop()前的链表：");
		System.out.println(list);
		System.out.print("弹出链表的第一个节点：");
		System.out.println(list.pop(list));
		System.out.print("pop()后的链表：");
		System.out.println(list);
		*/
		
		//5-add() Test
		/*
		System.out.print("add()前的链表：");
		System.out.println(list);
		System.out.print("在任意位置插入节点：");
		list.add(12,0);
		list.add(42,1);
		list.add(5,1);
		System.out.println(list);
		*/	
		
		//6-SortedInsert() Test
		/*
		System.out.print("SortedInsert()前的链表：");
		System.out.println(list);
		list.SortedInsert(list, list.createNode(22));
		list.SortedInsert(list, list.createNode(100));
		list.SortedInsert(list, list.createNode(3));
		list.SortedInsert(list, list.createNode(0));
		System.out.print(SortedInsert()后的链表：);
		System.out.println(list);
		*/
		
		//6-SortedInsert2() Test
		/*
		System.out.print("SortedInsert2()前的链表：");
		System.out.println(list);
		list.SortedInsert2(list, list.createNode(5));
		list.SortedInsert2(list, list.createNode(2));
		list.SortedInsert2(list, list.createNode(0));
		System.out.print("SortedInsert2()后的链表:");
		System.out.println(list);
		*/
		
		
	}
}
