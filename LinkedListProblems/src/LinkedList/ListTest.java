package LinkedList;

public class ListTest {
	
	
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList<Integer>();
		
		for(int i=0;i<4;i++) {
			list.addFirst(i);
			System.out.println(list);
		}
			
		list.SortedInsert(list);
		System.out.println(list);
		
		//第一题测试
		/*int a=list.Count(list, 2);
		System.out.println(a);
		
		//第二题测试
		System.out.println(list.GetNth(list, 2));
		
		//第3题测试
		list.DeleteList(list);
		list.addFirst(12);
		list.addFirst(10);
		list.addFirst(11);
		System.out.println(list);
		list.DeleteList(list);
		System.out.println(list);
		list.addFirst(10);
		System.out.println(list);*/
		
		//第4题测试
		//list.pop(list);
		/*System.out.println(list.pop(list));
		System.out.println(list);
		
		System.out.println(list.pop(list));
		System.out.println(x);*/
		
		//第5题测试
		/*
		list.add(12,0);
		list.add(42,1);
		list.add(5,1);
		System.out.println(list);
		*/		
	}

}
